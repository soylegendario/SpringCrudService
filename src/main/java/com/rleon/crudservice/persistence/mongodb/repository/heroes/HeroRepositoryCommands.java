package com.rleon.crudservice.persistence.mongodb.repository.heroes;

import com.rleon.crudservice.model.Hero;
import com.rleon.crudservice.persistence.mongodb.MongoDbClient;
import com.rleon.crudservice.persistence.repository.heroes.IHeroRepositoryCommands;
import org.springframework.stereotype.Component;

@Component
public class HeroRepositoryCommands implements IHeroRepositoryCommands<Hero> {

    private final MongoDbClient _context;

    public HeroRepositoryCommands(MongoDbClient context) {
        _context = context;
    }

    /**
     * Adds a hero to the repository
     *
     * @param hero Team to add
     */
    @Override
    public void addHero(Hero hero) {

    }
}
