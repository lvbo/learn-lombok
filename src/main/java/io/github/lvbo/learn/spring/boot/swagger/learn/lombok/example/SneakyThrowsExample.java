package io.github.lvbo.learn.spring.boot.swagger.learn.lombok.example;

import lombok.SneakyThrows;

import java.io.UnsupportedEncodingException;

public class SneakyThrowsExample implements Runnable {

    @SneakyThrows(UnsupportedEncodingException.class)
    public String utf8ToString(byte[] bytes) {
        return new String(bytes, "UTF-8");
    }

    @Override
    @SneakyThrows
    public void run() {
        throw new Throwable();
    }
}
