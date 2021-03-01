package com.rleon.crudservice.services.heroes;

import com.rleon.crudservice.model.Hero;
import com.rleon.crudservice.persistence.repository.heroes.IHeroRepositoryQueries;
import org.springframework.stereotype.Component;

@Component
public class HeroQueriesService {
    private final IHeroRepositoryQueries<Hero> _queries;

    public HeroQueriesService(IHeroRepositoryQueries<Hero> queries) {
        _queries = queries;
    }

    public Iterable<Hero> get() {
        return _queries.getHeroes();
    }

    public Hero getById(int id) {
        return _queries.getHero(id);
    }
}
