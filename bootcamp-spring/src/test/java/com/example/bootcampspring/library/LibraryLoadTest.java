package com.example.bootcampspring.library;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class LibraryLoadTest {

    @Test
    void testLoadFromDb() {
        //given
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(LibraryConfig.class);
        context.refresh();

        //when
        Library library = context.getBean(Library.class);

        //then
        assertNotNull(library);

    }

    @Test
    void testSaveToDb() {
        //given
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(LibraryConfig.class);
        context.refresh();

        //when
        Library library = context.getBean(Library.class);

        //then
        assertNotNull(library);
    }

    @Test
    void testContext() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com/example/bootcampspring");

        //when & then
        System.out.println("==== Beans list: ==== >>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<< ===== Beans list ====");

    }
}
