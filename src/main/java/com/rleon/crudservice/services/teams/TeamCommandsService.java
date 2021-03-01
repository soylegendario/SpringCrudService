package com.rleon.crudservice.services.teams;

import com.rleon.crudservice.model.Team;
import com.rleon.crudservice.persistence.repository.teams.ITeamRepositoryCommands;
import org.springframework.stereotype.Component;

@Component
public class TeamCommandsService {
    private final ITeamRepositoryCommands<Team> _commands;

    public TeamCommandsService(ITeamRepositoryCommands<Team> commands) {
        _commands = commands;
    }

    public void add(Team team) {
        _commands.addTeam(team);
    }
}
