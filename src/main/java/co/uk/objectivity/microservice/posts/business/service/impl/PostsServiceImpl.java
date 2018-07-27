package co.uk.objectivity.microservice.posts.business.service.impl;

import co.uk.objectivity.microservice.posts.business.service.PostsService;
import co.uk.objectivity.microservice.posts.facade.PostBO;
import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.LinkedList;
import java.util.List;

import static java.util.Arrays.asList;

public class PostsServiceImpl implements PostsService {
    private List<PostBO> posts = new LinkedList<PostBO>(asList(PostBO.builder()
            .id(1)
            .userId(1234)
            .description("Post 1")
            .build()));

    @Override
    public void addPost(PostBO postBO) {
        posts.add(postBO);
    }

    @Override
    public PostBO getPost(int id) throws InvalidArgumentException {
        // return posts.get(id);

        return posts.stream()
                .filter(x->x.getId() == id)
                .findFirst()
                .orElse(PostBO.builder().build());
    }

    @Override
    public List<PostBO> getAll() {
        return posts;
    }

    @Override
    public void deletePost(int id) {
        posts.remove(posts.stream()
                .filter(x->x.getId() == id)
                .findFirst()
                .orElseThrow(() -> new IndexOutOfBoundsException()));
    }
}
