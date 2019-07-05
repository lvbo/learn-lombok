package io.github.lvbo.learn.spring.boot.swagger.learn.lombok.example;

import lombok.*;

/**
 * @author lvbo
 * @version V1.0
 * @date 2019-07-02 15:08
 */
@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class ConstructorExample<T> {
    private int x;
    private int y;
    @NonNull
    private T description;

    @NoArgsConstructor
    public static class NoArgsExample {
        @NonNull private String field;
    }
}
