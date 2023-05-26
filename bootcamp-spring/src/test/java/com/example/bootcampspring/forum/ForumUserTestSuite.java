package com.example.bootcampspring.forum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ForumUserTestSuite {

    @Test
    void testGetUsername() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com/example/bootcampspring/forum");
        ForumUser bean = context.getBean(ForumUser.class);

        //when
        String name = bean.getUsername();

        //then
        Assertions.assertEquals("John Smith", name);
    }
}
