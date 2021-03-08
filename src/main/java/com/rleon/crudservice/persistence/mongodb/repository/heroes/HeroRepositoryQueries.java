package com.rleon.crudservice.persistence.mongodb.repository.heroes;

import com.google.common.collect.Lists;
import com.rleon.crudservice.model.Hero;
import com.rleon.crudservice.persistence.mongodb.MongoDbClient;
import com.rleon.crudservice.persistence.repository.heroes.IHeroRepositoryQueries;
import org.springframework.stereotype.Component;

@Component
public class HeroRepositoryQueries implements IHeroRepositoryQueries<Hero> {

    private final MongoDbClient _context;

    public HeroRepositoryQueries(MongoDbClient context) {
        _context = context;
    }

    /**
     * Gets the list of the heroes
     *
     * @return The list of the heroes
     */
    @Override
    public Iterable<Hero> getHeroes() {
        var cursor = _context.getHeroes().find();
        return Lists.newArrayList(cursor);
    }

    /**
     * Get a hero by id
     *
     * @param id hero id
     * @return The hero
     */
    @Override
    public Hero getHero(int id) {
        return null;
    }
}
