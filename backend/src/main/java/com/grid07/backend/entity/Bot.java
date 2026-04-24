package com.grid07.backend.entity;

import jakarta.persistence.*;

@Entity
public class Bot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String personaDescription;

    // getters & setters
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getPersonaDescription() { return personaDescription; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setPersonaDescription(String personaDescription) {
        this.personaDescription = personaDescription;
    }
}