package com.grid07.backend.service;

import com.grid07.backend.entity.Post;
import com.grid07.backend.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final PostRepository repo;

    public PostService(PostRepository repo) {
        this.repo = repo;
    }

    public Post create(Post post) {
        return repo.save(post);
    }

    public List<Post> getAll() {
        return repo.findAll();
    }

    public List<Post> getByUser(Long authorId) {
        return repo.findByAuthorId(authorId);
    }
}