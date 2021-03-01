package com.rleon.crudservice.api;

import com.rleon.crudservice.model.Team;
import com.rleon.crudservice.services.teams.TeamCommandsService;
import com.rleon.crudservice.services.teams.TeamQueriesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Teams {
    private final TeamQueriesService _teamQueriesService;
    private final TeamCommandsService _teamCommandsService;

    public Teams(TeamQueriesService queriesService, TeamCommandsService teamCommandsService) {
        _teamQueriesService = queriesService;
        _teamCommandsService = teamCommandsService;
    }

    @GetMapping("teams")
    public ResponseEntity<Object> get() {
        try {
            return new ResponseEntity<>(_teamQueriesService.get(), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("teams/{id}")
    public ResponseEntity<Object> get(@PathVariable int id) {
        try {
            var team = _teamQueriesService.getById(id);
            return (team == null)
                    ? new ResponseEntity<>("Hero not found", HttpStatus.NOT_FOUND)
                    : new ResponseEntity<>(team, HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("teams")
    public ResponseEntity<Object> post(@RequestBody Team team) {
        try {
            _teamCommandsService.add(team);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
