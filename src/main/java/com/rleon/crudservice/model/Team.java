package com.rleon.crudservice.model;

import java.io.Serializable;

public class Team implements Serializable {

    private int id;

    private String name;

    Team() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
