package com.lvbo.learn.learn.lombok.example;

import com.lvbo.learn.learn.lombok.model.User;
import lombok.NonNull;

public class NonNullExample {
    private String name;

    public NonNullExample(@NonNull User user) {
        this.name = user.getUsername();
    }
}
