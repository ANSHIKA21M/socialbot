package com.grid07.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "app_user")
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private boolean isPremium;

    // getters & setters
    public Long getId() { return id; }
    public String getUsername() { return username; }
    public boolean isPremium() { return isPremium; }

    public void setId(Long id) { this.id = id; }
    public void setUsername(String username) { this.username = username; }
    public void setPremium(boolean premium) { isPremium = premium; }
}