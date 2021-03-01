package com.rleon.crudservice.persistence.inmemory;

import com.rleon.crudservice.model.Hero;
import com.rleon.crudservice.model.Team;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class InMemoryContext {
    private ArrayList<Team> teams;

    private ArrayList<Hero> heroes;

    /**
     * Initializes a new instance of InMemoryContext class
     */
    public InMemoryContext(){
        teams = new ArrayList<>();
        heroes = new ArrayList<>();
    }


    /**
     * Gets the collection of teams
     * @return The teams
     */
    public ArrayList<Team> getTeams() {
        return teams;
    }

    /**
     * Gets the collection of heroes
     * @return The heroes
     */
    public ArrayList<Hero> getHeroes() {
        return heroes;
    }
}
