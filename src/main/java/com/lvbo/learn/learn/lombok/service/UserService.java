package com.lvbo.learn.learn.lombok.service;

import com.lvbo.learn.learn.lombok.model.User;
import lombok.NonNull;


public interface UserService {

    void createUser(@NonNull User user);
}
