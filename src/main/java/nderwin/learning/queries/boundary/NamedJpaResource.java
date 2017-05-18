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

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import nderwin.learning.queries.entity.Nppes;

/**
 *
 * @author nderwin
 */
@Stateless
@LocalBean
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
@Path("/namedjpa")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class NamedJpaResource {
    
    @PersistenceContext
    EntityManager em;

    @GET
    @Path("/")
    public Response getAll(
            @DefaultValue("50") @QueryParam("limit") final int limit,
            @QueryParam("npi") final String npi,
            @QueryParam("firstName") final String firstName,
            @QueryParam("lastName") final String lastName,
            @QueryParam("companyName") final String companyName
    ) {
        
        List<Nppes> data = em.createNamedQuery("Nppes.findAll", Nppes.class)
                .setParameter("npi", npi)
                .setParameter("companyName", companyName)
                .setParameter("lastName", lastName)
                .setParameter("firstName", firstName)
                .setMaxResults(limit)
                .getResultList();

        JsonArrayBuilder jab = Json.createArrayBuilder();
        data.stream().map((nppes) -> {
            JsonObjectBuilder job = Json.createObjectBuilder();
            job.add("NPI", nppes.getNpi());
            job.add("companyName", nppes.getProviderOrganizationNameLegalBusinessName());
            job.add("firstName", nppes.getProviderFirstName());
            job.add("lastName", nppes.getProviderLastNameLegalName());
            return job;
        }).forEachOrdered((job) -> {
            jab.add(job);
        });

        return Response.ok(jab.build()).build();
    }
}
