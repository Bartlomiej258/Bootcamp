package com.example.bootcampspring;

import com.example.bootcampspring.shape.*;
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
        Shape shape = (Shape) context.getBean("circle");

        //when
        String name = shape.getShapeName();

        //then
        Assertions.assertEquals("This is a circle", name);
    }

    @Test
    void testTriangleLoadedIntoContainer() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com/example/bootcampspring");
        Shape shape = (Shape) context.getBean("triangle");

        //when
        String name = shape.getShapeName();

        //then
        Assertions.assertEquals("This is a triangle", name);
    }

    @Test
    void testSquareLoadedIntoContainer() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com/example/bootcampspring/shape");
        Shape bean = (Shape) context.getBean("createSquare");

        //when
        String name = bean.getShapeName();

        //then
        Assertions.assertEquals("This is a square", name);
    }

    @Test
    void testShapeLoadedIntoContainer() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com/example/bootcampspring/shape");
        Shape shape = (Shape) context.getBean("chosenShape");

        //when
        String name = shape.getShapeName();

        //then
        System.out.println("Chosen shape says: " + name);
    }


    @Test
    void contextLoads() {
    }

}
