package com.rleon.crudservice.persistence.inmemory.repository.heroes;

import com.rleon.crudservice.model.Hero;
import com.rleon.crudservice.persistence.inmemory.InMemoryContext;
import com.rleon.crudservice.persistence.repository.heroes.IHeroRepositoryQueries;
import org.springframework.stereotype.Component;

@Component
public class HeroRepositoryQueries implements IHeroRepositoryQueries<Hero> {

    private final InMemoryContext _context;

    public HeroRepositoryQueries(InMemoryContext context) {
        _context = context;
    }

    /**
     * Gets the list of the heroes
     *
     * @return The list of the heroes
     */
    @Override
    public Iterable<Hero> getHeroes() {
        return _context.getHeroes();
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
