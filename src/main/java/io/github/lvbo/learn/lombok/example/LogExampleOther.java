package io.github.lvbo.learn.lombok.example;

import lombok.extern.slf4j.Slf4j;

/**
 * @author lvbo
 * @version V1.0
 * @date 2019-07-02 16:13
 */
@Slf4j
public class LogExampleOther {

    public static void main(String... args) {
        log.error("Something else is wrong here");
    }
}
