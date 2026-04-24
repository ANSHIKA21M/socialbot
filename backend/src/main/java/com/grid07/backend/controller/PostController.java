package com.grid07.backend.controller;

import com.grid07.backend.entity.Post;
import com.grid07.backend.repository.PostRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    private final PostRepository repo;

    public PostController(PostRepository repo) {
        this.repo = repo;
    }

    // ✅ Create Post
    @PostMapping
    public Post createPost(@RequestBody Post post) {
        return repo.save(post);
    }

    // ✅ Get All Posts
    @GetMapping
    public List<Post> getAllPosts() {
        return repo.findAll();
    }

    // ✅ Get Posts by User
    @GetMapping("/user/{authorId}")
    public List<Post> getPostsByUser(@PathVariable Long authorId) {
        return repo.findByAuthorId(authorId);
    }
}