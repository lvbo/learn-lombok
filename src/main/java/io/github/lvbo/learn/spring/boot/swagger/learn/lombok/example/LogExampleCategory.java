package io.github.lvbo.learn.spring.boot.swagger.learn.lombok.example;

import lombok.extern.apachecommons.CommonsLog;

/**
 * @author lvbo
 * @version V1.0
 * @date 2019-07-02 16:14
 */
@CommonsLog(topic="CounterLog")
public class LogExampleCategory {

    public static void main(String... args) {
        log.error("Calling the 'CounterLog' with a message");
    }
}
