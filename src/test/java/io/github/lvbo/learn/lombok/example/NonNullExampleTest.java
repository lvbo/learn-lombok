package io.github.lvbo.learn.lombok.example;

import org.junit.Test;

public class NonNullExampleTest {

    @Test(expected = NullPointerException.class)
    public void testNonNull() {
        new NonNullExample(null);
    }

}