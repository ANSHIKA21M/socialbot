package com.grid07.backend.controller;

import com.grid07.backend.entity.Bot;
import com.grid07.backend.repository.BotRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bots")
public class BotController {

    private final BotRepository repo;

    public BotController(BotRepository repo) {
        this.repo = repo;
    }

    // ✅ Create Bot
    @PostMapping
    public Bot createBot(@RequestBody Bot bot) {
        return repo.save(bot);
    }

    // ✅ Get All Bots
    @GetMapping
    public List<Bot> getAllBots() {
        return repo.findAll();
    }
}