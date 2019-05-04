package io.github.lvbo.learn.lombok.service;

import io.github.lvbo.learn.lombok.model.User;
import lombok.NonNull;


public interface UserService {

    void createUser(@NonNull User user);
}
