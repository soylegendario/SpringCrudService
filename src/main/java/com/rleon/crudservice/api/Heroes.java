package com.rleon.crudservice.api;

import com.rleon.crudservice.model.Hero;
import com.rleon.crudservice.services.heroes.HeroCommandsService;
import com.rleon.crudservice.services.heroes.HeroQueriesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Heroes {
    private final HeroQueriesService _heroQueriesService;
    private final HeroCommandsService _heroCommandsService;

    public Heroes(HeroQueriesService heroQueriesService, HeroCommandsService heroCommandsService) {
        _heroQueriesService = heroQueriesService;
        _heroCommandsService = heroCommandsService;
    }

    @GetMapping("heroes")
    public ResponseEntity<Object> get() {
        try {
            return new ResponseEntity<>(_heroQueriesService.get(), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("heroes/{id}")
    public ResponseEntity<Object> get(@PathVariable int id) {
        try {
            var hero = _heroQueriesService.getById(id);
            return (hero == null)
                    ? new ResponseEntity<>("Team not found", HttpStatus.NOT_FOUND)
                    : new ResponseEntity<>(hero, HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("heroes")
    public ResponseEntity<Object> post(@RequestBody Hero hero) {
        try {
            _heroCommandsService.add(hero);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
