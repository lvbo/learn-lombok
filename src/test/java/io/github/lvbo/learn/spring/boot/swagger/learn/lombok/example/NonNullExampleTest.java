package io.github.lvbo.learn.spring.boot.swagger.learn.lombok.example;

import org.junit.Test;

public class NonNullExampleTest {

    @Test(expected = NullPointerException.class)
    public void testNonNull() {
        new NonNullExample(null);
    }

}