package com.rleon.crudservice.services.teams;

import com.rleon.crudservice.model.Team;
import com.rleon.crudservice.persistence.repository.teams.ITeamRepositoryQueries;
import org.springframework.stereotype.Component;

@Component
public class TeamQueriesService {

    private final ITeamRepositoryQueries<Team> _queries;

    public TeamQueriesService(ITeamRepositoryQueries<Team> queries) {
        _queries = queries;
    }

    public Iterable<Team> get() {
        return _queries.getTeams();
    }

    public Team getById(int id) {
        return _queries.getTeam(id);
    }
}
