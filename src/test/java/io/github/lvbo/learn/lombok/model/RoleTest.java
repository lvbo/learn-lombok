package io.github.lvbo.learn.lombok.model;

import org.junit.Test;

public class RoleTest {

    @Test
    public void printName() {
        Role role = Role.builder().name("admin").build();
        role.printName();
    }
}