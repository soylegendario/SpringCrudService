package com.rleon.crudservice.persistence.mongodb.repository.teams;

import com.rleon.crudservice.model.Team;
import com.rleon.crudservice.persistence.mongodb.MongoDbClient;
import com.rleon.crudservice.persistence.repository.teams.ITeamRepositoryQueries;
import org.springframework.stereotype.Component;

@Component
public class TeamRepositoryQueries implements ITeamRepositoryQueries<Team> {

    private final MongoDbClient _context;

    public TeamRepositoryQueries(MongoDbClient context) {

        _context = context;
    }

    /**
     * Gets the list of the teams
     *
     * @return The list of the teams
     */
    @Override
    public Iterable<Team> getTeams() {
        return null;
    }

    /**
     * Get a team by id
     *
     * @param id Team id
     * @return The team
     */
    @Override
    public Team getTeam(int id) {
        return null;
    }
}
