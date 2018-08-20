package com.example.seang.sem8project.models;

import com.example.seang.sem8project.models.User;

public class ServerRequest {

    private String operation;
    private User user;

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
