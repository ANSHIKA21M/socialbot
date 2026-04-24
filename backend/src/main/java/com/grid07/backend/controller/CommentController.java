package com.grid07.backend.controller;

import com.grid07.backend.entity.Comment;
import com.grid07.backend.repository.CommentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {

    private final CommentRepository repo;

    public CommentController(CommentRepository repo) {
        this.repo = repo;
    }

    // ✅ Create Comment
    @PostMapping
    public Comment createComment(@RequestBody Comment comment) {
        return repo.save(comment);
    }

    // ✅ Get All Comments
    @GetMapping
    public List<Comment> getAllComments() {
        return repo.findAll();
    }

    // ✅ Get Comments by Post
    @GetMapping("/post/{postId}")
    public List<Comment> getByPost(@PathVariable Long postId) {
        return repo.findByPostId(postId);
    }
}