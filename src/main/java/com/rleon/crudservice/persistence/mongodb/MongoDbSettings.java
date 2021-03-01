package com.rleon.crudservice.persistence.mongodb;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import org.springframework.stereotype.Component;

@Component
public class MongoDbSettings {

    private final ConnectionString connString = new ConnectionString("");

    public MongoClientSettings build() {
        return MongoClientSettings.builder()
                .applyConnectionString(connString)
                .retryWrites(true)
                .build();
    }
}
