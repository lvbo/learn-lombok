package io.github.lvbo.learn.spring.boot.swagger.learn.lombok.model;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private long id;
    private String username;
    private String password;
    private String phone;
}
