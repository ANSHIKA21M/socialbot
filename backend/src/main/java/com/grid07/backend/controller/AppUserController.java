package com.grid07.backend.controller;

import com.grid07.backend.entity.AppUser;
import com.grid07.backend.service.AppUserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class AppUserController {

    private final AppUserService service;

    public AppUserController(AppUserService service) {
        this.service = service;
    }

    // ✅ Create User
    @PostMapping
    public AppUser createUser(@RequestBody AppUser user) {
        return service.create(user);
    }

    // ✅ Get All Users
    @GetMapping
    public List<AppUser> getAllUsers() {
        return service.getAll();
    }
}