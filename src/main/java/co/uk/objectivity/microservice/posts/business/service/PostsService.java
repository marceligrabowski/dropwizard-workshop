package co.uk.objectivity.microservice.posts.business.service;

import co.uk.objectivity.microservice.posts.facade.PostBO;
import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.List;

public interface PostsService {
    void addPost(PostBO postBO);

    PostBO getPost(int id) throws InvalidArgumentException;

    List<PostBO> getAll();

    void deletePost(int id);
}
