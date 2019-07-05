package io.github.lvbo.learn.spring.boot.swagger.learn.lombok.service;

import io.github.lvbo.learn.spring.boot.swagger.learn.lombok.model.User;
import lombok.NonNull;


public interface UserService {

    void createUser(@NonNull User user);
}
