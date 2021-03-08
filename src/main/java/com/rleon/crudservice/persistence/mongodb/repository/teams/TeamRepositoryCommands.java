package com.rleon.crudservice.persistence.mongodb.repository.teams;

import com.rleon.crudservice.model.Team;
import com.rleon.crudservice.persistence.mongodb.MongoDbClient;
import com.rleon.crudservice.persistence.repository.teams.ITeamRepositoryCommands;
import org.springframework.stereotype.Component;

@Component
public class TeamRepositoryCommands implements ITeamRepositoryCommands<Team> {

    private final MongoDbClient _context;

    public TeamRepositoryCommands(MongoDbClient context) {
        _context = context;
    }

    /**
     * Adds a team to the repository
     *
     * @param team Team to add
     */
    @Override
    public void addTeam(Team team) {

    }
}
