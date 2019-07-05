package io.github.lvbo.learn.spring.boot.swagger.learn.lombok.example;

import io.github.lvbo.learn.spring.boot.swagger.learn.lombok.model.User;
import lombok.NonNull;

public class NonNullExample {
    private String name;

    public NonNullExample(@NonNull User user) {
        this.name = user.getUsername();
    }
}
