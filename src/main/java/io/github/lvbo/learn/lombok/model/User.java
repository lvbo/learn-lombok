package io.github.lvbo.learn.lombok.model;

import lombok.*;

/**
 * @author lvbo
 */
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
