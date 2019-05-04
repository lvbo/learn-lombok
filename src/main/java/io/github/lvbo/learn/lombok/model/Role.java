package io.github.lvbo.learn.lombok.model;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@Builder
public class Role {

    private String name;

    public void printName() {
        log.debug("role name is " + name);
    }
}
