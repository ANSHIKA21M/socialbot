package com.grid07.backend.repository;

import com.grid07.backend.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {

    // 🔍 Find by username
    Optional<AppUser> findByUsername(String username);

    // 🔍 Check if username exists
    boolean existsByUsername(String username);
}