package com.grid07.backend.repository;

import com.grid07.backend.entity.Bot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BotRepository extends JpaRepository<Bot, Long> {

    // 🔍 Find bot by name
    Bot findByName(String name);
}