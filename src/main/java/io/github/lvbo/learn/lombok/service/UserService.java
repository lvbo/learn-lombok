package io.github.lvbo.learn.lombok.service;

import io.github.lvbo.learn.lombok.model.User;
import lombok.NonNull;

/**
 * @author lvbo
 */
public interface UserService {

    /**
     * 创建用户
     * @param user 用户对象
     */
    void createUser(@NonNull User user);
}
