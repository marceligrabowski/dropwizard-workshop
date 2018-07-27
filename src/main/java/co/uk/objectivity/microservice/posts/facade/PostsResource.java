package co.uk.objectivity.microservice.posts.facade;

import co.uk.objectivity.microservice.posts.business.service.PostsService;
import com.google.inject.Inject;
import com.sun.javaws.exceptions.InvalidArgumentException;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Consumes("application/json")
@Produces("application/json")
@Path("posts")
public class PostsResource {

    @Inject
    private PostsService postsService;

    @GET
    public Response getAll(){
        return Response.ok(postsService.getAll()).build();
    }

    @GET
    @Path("{id}")
    public Response get(@PathParam("id") int id) throws InvalidArgumentException {
        return Response.ok(postsService.getPost(id)).build();
    }

    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") int id){
        postsService.deletePost(id);
        return Response.ok().build();
    }

    @POST
    public Response add(@Valid @NotNull PostBO postBO){
        postsService.addPost(postBO);
        return Response.ok().build();
    }
}
