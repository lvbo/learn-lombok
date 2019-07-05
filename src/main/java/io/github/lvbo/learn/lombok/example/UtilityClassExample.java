package io.github.lvbo.learn.lombok.example;

import lombok.experimental.UtilityClass;

/**
 * @author lvbo
 */
@UtilityClass
public class UtilityClassExample {
    private final int CONSTANT = 5;

    public int addSomething(int in) {
        return in + CONSTANT;
    }
}
