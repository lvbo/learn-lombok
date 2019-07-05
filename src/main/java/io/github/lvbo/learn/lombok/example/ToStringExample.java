package io.github.lvbo.learn.lombok.example;

import io.github.lvbo.learn.lombok.model.Shape;
import lombok.ToString;

/**
 * @author lvbo
 * @version V1.0
 * @date 2019-07-02 14:51
 */
@ToString
public class ToStringExample {
    private static final int STATIC_VAR = 10;
    private String name;
    private Shape shape = new Square(5, 10);
    private String[] tags;
    @ToString.Exclude
    private int id;

    public String getName() {
        return this.name;
    }

    @ToString(callSuper=true, includeFieldNames=true)
    public static class Square extends Shape {
        private final int width, height;

        public Square(int width, int height) {
            this.width = width;
            this.height = height;
        }
    }
}
