package com.grid07.backend.service;

import com.grid07.backend.entity.Comment;
import com.grid07.backend.repository.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    private final CommentRepository repo;

    public CommentService(CommentRepository repo) {
        this.repo = repo;
    }

    public Comment create(Comment comment) {
        return repo.save(comment);
    }

    public List<Comment> getAll() {
        return repo.findAll();
    }

    public List<Comment> getByPost(Long postId) {
        return repo.findByPostId(postId);
    }
}