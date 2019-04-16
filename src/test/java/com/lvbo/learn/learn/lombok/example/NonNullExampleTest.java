package com.lvbo.learn.learn.lombok.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class NonNullExampleTest {

    @Test(expected = NullPointerException.class)
    public void testNonNull() {
        new NonNullExample(null);
    }

}