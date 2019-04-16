package com.lvbo.learn.learn.lombok.service.impl;

import com.lvbo.learn.learn.lombok.model.User;
import com.lvbo.learn.learn.lombok.service.UserService;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Override
    public void createUser(@NonNull User user) {
        log.debug("import params:", user);
    }
}
