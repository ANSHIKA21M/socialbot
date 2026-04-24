package com.grid07.backend.service;

import com.grid07.backend.entity.AppUser;
import com.grid07.backend.repository.AppUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUserService {

    private final AppUserRepository repo;

    public AppUserService(AppUserRepository repo) {
        this.repo = repo;
    }

    // ✅ Create User
    public AppUser create(AppUser user) {
        return repo.save(user);
    }

    // ✅ Get All Users
    public List<AppUser> getAll() {
        return repo.findAll();
    }

    // ✅ Get User by ID
    public AppUser getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    // ✅ Delete User
    public void delete(Long id) {
        repo.deleteById(id);
    }
}