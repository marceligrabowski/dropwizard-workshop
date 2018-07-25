package co.uk.objectivity.microservice.resources;

import co.uk.objectivity.microservice.services.BallService;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("ball")
public class BallResource {

    @Inject
    @Named("Football")
    private BallService footballService;

    @Inject
    @Named("Volleyball")
    private BallService volleyballService;


    @GET
    @Path("football")
    public Response hitFootball(){
        footballService.hitBall();
        return Response.ok().build();
    }

    @GET
    @Path("volleyball")
    public Response hitVolleyball(){
        volleyballService.hitBall();
        return Response.ok().build();
    }
}
