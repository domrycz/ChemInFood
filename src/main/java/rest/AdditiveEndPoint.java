package rest;

import dao.AdditiveDAO;
import domain.Additive;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/additives")
@Produces(MediaType.APPLICATION_JSON)
public class AdditiveEndPoint {

    @Inject
    private AdditiveDAO additiveDAO;

    @GET
    @Path("/{numberE}")
    public Response getAdditive(@PathParam("numberE") String numberE) {
        if(additiveDAO.read(numberE) != null) {
            Additive additive = additiveDAO.read(numberE);
            return Response.ok().entity(additive).build();
        } else {
            return Response.status(404).build();
        }
    }

    @GET
    public Response getAll() {
        List<Additive> additives = additiveDAO.showAll();
        if(additives.isEmpty()) {
            return Response.status(404).build();
        } else {
            return Response.ok(additives).build();
        }
    }
}
