package com.rleon.crudservice.persistence.inmemory.repository.teams;

import com.rleon.crudservice.model.Team;
import com.rleon.crudservice.persistence.inmemory.InMemoryContext;
import com.rleon.crudservice.persistence.repository.teams.ITeamRepositoryCommands;
import org.springframework.stereotype.Component;

@Component
public class TeamRepositoryCommands implements ITeamRepositoryCommands<Team> {

    private final InMemoryContext _context;

    public TeamRepositoryCommands(InMemoryContext context) {
        _context = context;
    }

    /**
     * Adds a team to the repository
     *
     * @param team Team to add
     */
    @Override
    public void addTeam(Team team) {
        _context.getTeams().add(team);
    }
}