package com.lvbo.learn.learn.lombok.controller;

import com.alibaba.fastjson.JSON;
import com.lvbo.learn.learn.lombok.model.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {

    private MockMvc mockMvc;
    @Autowired
    private UserController userController;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
    }

    @Test
    public void create() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.post("/user")
                        .param("user", "{\"id\":90,\"password\":\"123456\",\"phone\":\"13453423456\",\"username\":\"lvbo\"}")
                        .accept(MediaType.APPLICATION_PROBLEM_JSON_UTF8))
                .andDo(print());
    }
}