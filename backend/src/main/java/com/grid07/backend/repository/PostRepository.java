package com.grid07.backend.repository;

import com.grid07.backend.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    // 🔍 Get all posts by a user
    List<Post> findByAuthorId(Long authorId);
}