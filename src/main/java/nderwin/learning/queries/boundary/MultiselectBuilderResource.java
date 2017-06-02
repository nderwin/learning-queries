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

import java.util.ArrayList;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import nderwin.learning.queries.entity.Nppes;
import nderwin.learning.queries.entity.Nppes_;

/**
 *
 * @author nderwin
 */
@Stateless
@LocalBean
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
@Path("/multiselect")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MultiselectBuilderResource {

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

        // Create the builder
        CriteriaBuilder builder = em.getCriteriaBuilder();

        // Create the query
        CriteriaQuery<NppesListData> query = builder.createQuery(NppesListData.class);

        // Create the FROM clause
        Root<Nppes> root = query.from(Nppes.class);

        // Create the SELECT clause
        query.multiselect(
                root.get(Nppes_.npi),
                root.get(Nppes_.providerOrganizationNameLegalBusinessName),
                root.get(Nppes_.providerFirstName),
                root.get(Nppes_.providerLastNameLegalName)
        );

        // Create the WHERE clause
        createWhereClause(builder, root, query, npi, firstName, lastName, companyName);

        // Create the ORDER BY clause
        query.orderBy(
                builder.asc(root.get(Nppes_.providerLastNameLegalName)),
                builder.asc(root.get(Nppes_.providerFirstName)),
                builder.asc(root.get(Nppes_.npi))
        );

        List<NppesListData> data = em.createQuery(query)
                .setMaxResults(limit)
                .getResultList();

        return Response.ok(data).build();
    }

    private void createWhereClause(final CriteriaBuilder builder, final Root<Nppes> root, final CriteriaQuery<NppesListData> query, final String npi, final String firstName, final String lastName, final String companyName) {
        List<Predicate> criteria = new ArrayList<>();

        if (null != npi && !npi.trim().isEmpty()) {
            criteria.add(
                    builder.equal(root.get(Nppes_.npi), builder.literal(npi.toUpperCase()))
            );
        }

        if (null != firstName && !firstName.trim().isEmpty()) {
            criteria.add(
                    builder.equal(root.get(Nppes_.providerFirstName), builder.literal(firstName.toUpperCase()))
            );
        }

        if (null != lastName && !lastName.trim().isEmpty()) {
            criteria.add(
                    builder.equal(root.get(Nppes_.providerLastNameLegalName), builder.literal(lastName.toUpperCase()))
            );
        }

        if (null != companyName && !companyName.trim().isEmpty()) {
            criteria.add(
                    builder.equal(root.get(Nppes_.providerOrganizationNameLegalBusinessName), builder.literal(companyName.toUpperCase()))
            );
        }

        query.where(criteria.toArray(new Predicate[criteria.size()]));
    }
}
