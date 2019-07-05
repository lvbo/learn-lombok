package io.github.lvbo.learn.spring.boot.swagger.learn.lombok.example;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;

/**
 * @author lvbo
 * @version V1.0
 * @date 2019-07-02 15:15
 */
@Data
public class DataExample {
    private final String name;
    @Setter(AccessLevel.PACKAGE)
    private int age;
    private double score;
    private String[] tags;

    @ToString(includeFieldNames=true)
    @Data(staticConstructor="of")
    public static class Exercise<T> {
        private final String name;
        private final T value;
    }
}
