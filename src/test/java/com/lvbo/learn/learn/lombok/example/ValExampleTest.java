package com.lvbo.learn.learn.lombok.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValExampleTest {

    @Test
    public void example() {
       assertEquals("hello, world!", new ValExample().example());
    }

    @Test
    public void example2() {
        new ValExample().example2();
    }
}