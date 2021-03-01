package com.rleon.crudservice.persistence.inmemory.repository.teams;

import com.rleon.crudservice.model.Team;
import com.rleon.crudservice.persistence.inmemory.InMemoryContext;
import com.rleon.crudservice.persistence.repository.teams.ITeamRepositoryQueries;
import org.springframework.stereotype.Component;

@Component
public class TeamRepositoryQueries implements ITeamRepositoryQueries<Team> {

    private final InMemoryContext _context;

    public TeamRepositoryQueries(InMemoryContext context) {
        _context = context;
    }

    /**
     * Gets the list of the teams
     *
     * @return The list of the teams
     */
    @Override
    public Iterable<Team> getTeams() {
        return _context.getTeams();
    }

    /**
     * Get a team by id
     *
     * @param id Team id
     * @return The team
     */
    @Override
    public Team getTeam(int id) {
        var teams = _context.getTeams();
        Team found = null;
        for (Team team: teams) {
            if (team.getId() == id) {
                found = team;
                break;
            }
        }
        return found;
    }
}