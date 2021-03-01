package com.rleon.crudservice.persistence.inmemory.repository.heroes;

import com.rleon.crudservice.model.Hero;
import com.rleon.crudservice.persistence.inmemory.InMemoryContext;
import com.rleon.crudservice.persistence.repository.heroes.IHeroRepositoryCommands;
import org.springframework.stereotype.Component;

@Component
public class HeroRepositoryCommands implements IHeroRepositoryCommands<Hero> {

    private final InMemoryContext _context;

    public HeroRepositoryCommands(InMemoryContext context) {
        _context = context;
    }

    /**
     * Adds a hero to the repository
     *
     * @param hero Team to add
     */
    @Override
    public void addHero(Hero hero) {
        _context.getHeroes().add(hero);
    }
}
