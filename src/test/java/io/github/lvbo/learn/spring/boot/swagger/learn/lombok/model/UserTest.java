package io.github.lvbo.learn.spring.boot.swagger.learn.lombok.model;

import org.junit.Assert;
import org.junit.Test;

public class UserTest {

    @Test
    public void testToString() {
        User user = new User();
        user.setId(90);
        user.setUsername("lvbo");
        user.setPassword("123456");
        user.setPhone("13453423456");
        System.out.println(user);
        System.out.println(user.getPassword());
    }

    @Test
    public void testEquals() {
        User user1 = new User();
        user1.setId(90);
        user1.setUsername("lvbo");
        user1.setPassword("123456");
        user1.setPhone("13453423456");
        User user2 = new User();
        user2.setId(90);
        user2.setUsername("lvbo");
        user2.setPassword("123456");
        user2.setPhone("13453423456");
        Assert.assertEquals(true, user1.equals(user2));
    }

}