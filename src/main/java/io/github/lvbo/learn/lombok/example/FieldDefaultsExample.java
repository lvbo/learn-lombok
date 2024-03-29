package io.github.lvbo.learn.lombok.example;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.experimental.NonFinal;
import lombok.experimental.PackagePrivate;

/**
 * @author lvbo
 */
@FieldDefaults(makeFinal=true, level= AccessLevel.PRIVATE)
public class FieldDefaultsExample {
    public final int a;
    int b;
    @NonFinal
    int c;
    @PackagePrivate
    int d;

    FieldDefaultsExample() {
        a = 0;
        b = 0;
        d = 0;
    }
}
