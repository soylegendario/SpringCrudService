package com.rleon.crudservice.persistence.repository.teams;

public interface ITeamRepositoryQueries<TEntity> {

    /**
     * Gets the list of the teams
     * @return The list of the teams
     */
    Iterable<TEntity> getTeams();

    /**
     * Get a team by id
     * @param id Team id
     * @return The team
     */
    TEntity getTeam(int id);
}
