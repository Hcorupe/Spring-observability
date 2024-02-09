package com.Hcorupe.observability.Post;

import com.Hcorupe.observability.Post.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {


    private final JsonPlaceHolderService jsonPlaceHolderService;
    // constructor injection
    public PostController(JsonPlaceHolderService jsonPlaceHolderService) {
        this.jsonPlaceHolderService = jsonPlaceHolderService;
    }

    @GetMapping("")
    List<Post> findAll(){
        return jsonPlaceHolderService.findAll();
    }
}
