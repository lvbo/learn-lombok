package io.github.lvbo.learn.lombok.example;

import org.junit.Test;

/**
 * @author lvbo
 * @version V1.0
 * @date 2019-07-02 15:52
 */
public class BuilderExampleTest {

    @Test
    public void testBuilderExampleCreate() {
        BuilderExample builderExample = BuilderExample.builder()
                .age(11)
                .name("mm")
                .occupation("11")
                .occupation("22")
                .build();
        System.out.println(builderExample);
    }
}
