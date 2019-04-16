package com.lvbo.learn.learn.lombok.example;

import lombok.AccessLevel;
import lombok.ToString;
import lombok.Value;
import lombok.experimental.NonFinal;
import lombok.experimental.Wither;

@Value
public class ValueExample {
    String name;
    @Wither(AccessLevel.PACKAGE) @NonFinal
    int age;
    double score;
    protected String[] tags;

    @ToString(includeFieldNames=true)
    @Value(staticConstructor="of")
    public static class Exercise<T> {
        String name;
        T value;
    }
}
