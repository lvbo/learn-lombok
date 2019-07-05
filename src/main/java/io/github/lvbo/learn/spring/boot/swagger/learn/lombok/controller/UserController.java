package io.github.lvbo.learn.spring.boot.swagger.learn.lombok.controller;

import com.alibaba.fastjson.JSON;
import io.github.lvbo.learn.spring.boot.swagger.learn.lombok.model.User;
import io.github.lvbo.learn.spring.boot.swagger.learn.lombok.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public void create(@RequestParam String user) {
        userService.createUser(JSON.parseObject(user, User.class));
    }
}
