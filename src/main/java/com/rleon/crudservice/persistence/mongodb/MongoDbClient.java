package com.rleon.crudservice.persistence.mongodb;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.rleon.crudservice.model.Hero;
import com.rleon.crudservice.model.Team;
import org.springframework.stereotype.Component;

@Component
public class MongoDbClient {
    private final MongoClient _client;

    public MongoDbClient(MongoDbSettings settings) { _client = MongoClients.create(settings.build());
    }

    public MongoDatabase getDatabase() {
        return _client.getDatabase("Marvel");
    }

    public MongoCollection<Team> getTeams() {
        return getDatabase().getCollection("Teams", Team.class);
    }

    public MongoCollection<Hero> getHeroes() {
        return getDatabase().getCollection("Heroes", Hero.class);
    }
}
