package com.grid07.backend.service;

import com.grid07.backend.entity.Bot;
import com.grid07.backend.repository.BotRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BotService {

    private final BotRepository repo;

    public BotService(BotRepository repo) {
        this.repo = repo;
    }

    public Bot create(Bot bot) {
        return repo.save(bot);
    }

    public List<Bot> getAll() {
        return repo.findAll();
    }

    public Bot getById(Long id) {
        return repo.findById(id).orElse(null);
    }
}