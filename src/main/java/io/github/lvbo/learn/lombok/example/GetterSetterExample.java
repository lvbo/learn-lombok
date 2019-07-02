package io.github.lvbo.learn.lombok.example;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * @author lvbo
 * @version V1.0
 * @date 2019-07-02 14:45
 */
public class GetterSetterExample {

    @Getter
    @Setter
    private int age = 10;

    @Setter(AccessLevel.PROTECTED)
    private String name;

    @Override public String toString() {
        return String.format("%s (age: %d)", name, age);
    }
}
