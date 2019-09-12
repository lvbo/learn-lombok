package io.github.lvbo.learn.lombok.controller;

import com.alibaba.fastjson.JSON;
import io.github.lvbo.learn.lombok.model.User;
import io.github.lvbo.learn.lombok.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lvbo
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public void create(@RequestParam String user) {
        log.info("user is {}", user);
        userService.createUser(JSON.parseObject(user, User.class));
    }
}
