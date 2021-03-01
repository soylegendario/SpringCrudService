package com.rleon.crudservice.persistence.repository.heroes;

public interface IHeroRepositoryQueries<TEntity> {
    /**
     * Gets the list of the heroes
     *
     * @return The list of the heroes
     */
    Iterable<TEntity> getHeroes();

    /**
     * Get a hero by id
     *
     * @param id hero id
     * @return The hero
     */
    TEntity getHero(int id);

}
