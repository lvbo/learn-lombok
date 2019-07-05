package io.github.lvbo.learn.spring.boot.swagger.learn.lombok.example;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.Set;

/**
 * @author lvbo
 */
@Builder
@Data
public class BuilderExample {
    @Builder.Default
    private long created = System.currentTimeMillis();
    private String name;
    private int age;
    @Singular
    private Set<String> occupations;
}
