/*
 * Copyright 2017 Nathan Erwin.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nderwin.learning.queries.boundary;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import javax.sql.DataSource;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author nderwin
 */
@Stateless
@LocalBean
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
@Path("/manual")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ManualResource {
    
    private static final Logger LOG = Logger.getLogger(ManualResource.class.getName());

    @Resource(lookup = "java:/lqDS")
    DataSource dataSource;
    
    @GET
    @Path("/")
    public Response getAll(
            @DefaultValue("50") @QueryParam("limit") final int limit,
            @QueryParam("npi") final String npi,
            @QueryParam("firstName") final String firstName,
            @QueryParam("lastName") final String lastName,
            @QueryParam("companyName") final String companyName
    ) {
        
        try (Connection conn = dataSource.getConnection(); Statement stmt = conn.createStatement()) {
            StringBuilder sb = new StringBuilder("SELECT \"NPI\", \"Provider_Organization_Name__Legal_Business_Name\", \"Provider_Last_Name__Legal_Name\", \"Provider_First_Name\" FROM nppes");
            boolean nowhere = true;
            
            if (null != npi && !npi.trim().isEmpty()) {
                if (nowhere) {
                    sb.append(" WHERE");
                    nowhere = false;
                }
                
                sb.append(" \"NPI\" = '");
                sb.append(npi.toUpperCase());
                sb.append("'");
            }

            if (null != firstName && !firstName.trim().isEmpty()) {
                if (nowhere) {
                    sb.append(" WHERE");
                    nowhere = false;
                } else {
                    sb.append(" AND ");
                }
                
                sb.append(" \"Provider_First_Name\" = '");
                sb.append(firstName.toUpperCase());
                sb.append("'");
            }

            if (null != lastName && !lastName.trim().isEmpty()) {
                if (nowhere) {
                    sb.append(" WHERE");
                    nowhere = false;
                } else {
                    sb.append(" AND ");
                }
                
                sb.append(" \"Provider_Last_Name__Legal_Name\" = '");
                sb.append(lastName.toUpperCase());
                sb.append("'");
            }

            if (null != companyName && !companyName.trim().isEmpty()) {
                if (nowhere) {
                    sb.append(" WHERE");
                } else {
                    sb.append(" AND ");
                }
                
                sb.append(" \"Provider_Organization_Name__Legal_Business_Name\" = '");
                sb.append(companyName.toUpperCase());
                sb.append("'");
            }

            sb.append(" ORDER BY \"Provider_Last_Name__Legal_Name\", \"Provider_First_Name\", \"NPI\"");
            sb.append(" LIMIT ");
            sb.append(limit);
            
            ResultSet rs = stmt.executeQuery(sb.toString());
            
            JsonArrayBuilder jab = Json.createArrayBuilder();
            while (rs.next()) {
                JsonObjectBuilder job = Json.createObjectBuilder();

                job.add("NPI", rs.getString("NPI"));
                job.add("companyName", rs.getString("Provider_Organization_Name__Legal_Business_Name"));
                job.add("firstName", rs.getString("Provider_First_Name"));
                job.add("lastName", rs.getString("Provider_Last_Name__Legal_Name"));
                
                jab.add(job);
            }
            
            return Response.ok(jab.build()).build();
        } catch (SQLException ex) {
            LOG.log(Level.SEVERE, ex.getMessage(), ex);
            return Response.serverError().entity(ex.getMessage()).build();
        }
    }
    
}
