package com.lvbo.learn.learn.lombok.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class RoleTest {

    @Test
    public void printName() {
        Role role = Role.builder().name("admin").build();
        role.printName();
    }
}