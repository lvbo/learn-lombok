package io.github.lvbo.learn.spring.boot.swagger.learn.lombok.example;

import io.github.lvbo.learn.spring.boot.swagger.learn.lombok.model.Shape;
import lombok.EqualsAndHashCode;

/**
 * @author lvbo
 * @version V1.0
 * @date 2019-07-02 15:05
 */
@EqualsAndHashCode
public class EqualsAndHashCodeExample {
    private transient int transientVar = 10;
    private String name;
    private double score;
    @EqualsAndHashCode.Exclude
    private Shape shape = new Square(5, 10);
    private String[] tags;
    @EqualsAndHashCode.Exclude
    private int id;

    public String getName() {
        return this.name;
    }

    @EqualsAndHashCode(callSuper=true)
    public static class Square extends Shape {
        private final int width, height;

        public Square(int width, int height) {
            this.width = width;
            this.height = height;
        }
    }
}