package com.rleon.crudservice.persistence.repository.heroes;

public interface IHeroRepositoryCommands<TEntity> {
    /**
     * Adds a hero to the repository
     *
     * @param hero Team to add
     */
    void addHero(TEntity hero);
}
