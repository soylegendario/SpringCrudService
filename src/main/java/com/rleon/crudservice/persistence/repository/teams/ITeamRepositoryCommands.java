package com.rleon.crudservice.persistence.repository.teams;

public interface ITeamRepositoryCommands<TEntity> {

    /**
     * Adds a team to the repository
     *
     * @param team Team to add
     */
    void addTeam(TEntity team);
}
