package com.rleon.crudservice.services.heroes;

import com.rleon.crudservice.model.Hero;
import com.rleon.crudservice.persistence.repository.heroes.IHeroRepositoryCommands;
import com.rleon.crudservice.services.teams.TeamQueriesService;
import org.springframework.stereotype.Component;

@Component
public class HeroCommandsService {
    private final IHeroRepositoryCommands<Hero> _commands;
    private final TeamQueriesService _teamQueriesService;

    public HeroCommandsService(IHeroRepositoryCommands<Hero> commands, TeamQueriesService teamQueriesService) {
        _commands = commands;
        _teamQueriesService = teamQueriesService;
    }

    public void add(Hero hero) throws Exception {
        if (hero.getTeamId() != null) {
            var team = _teamQueriesService.getById(hero.getTeamId());
            if (team == null) {
                throw new Exception("Team not found");
            }
        }
        _commands.addHero(hero);
    }
}
