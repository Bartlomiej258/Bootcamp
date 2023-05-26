package com.example.bootcampspring;

import com.example.bootcampspring.shape.Circle;
import com.example.bootcampspring.shape.Shape;
import com.example.bootcampspring.shape.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class BootcampSpringApplicationTests {

    @Test
    void testCircleLoadedIntoContainer() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com/example/bootcampspring");
        Shape shape = context.getBean(Circle.class);

        //when
        String name = shape.getShapeName();

        //then
        Assertions.assertEquals("This is a circle", name);
    }

    @Test
    void testTriangleLoadedIntoContainer() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com/example/bootcampspring");
        Shape shape = context.getBean(Triangle.class);

        //when
        String name = shape.getShapeName();

        //then
        Assertions.assertEquals("This is a triangle", name);
    }

    @Test
    void contextLoads() {
    }

}
