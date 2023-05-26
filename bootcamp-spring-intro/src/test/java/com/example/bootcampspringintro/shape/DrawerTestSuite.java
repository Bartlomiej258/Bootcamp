package com.example.bootcampspringintro.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DrawerTestSuite {

    @Test
    void testDoDrawingWithCircle() {
        //given
        Circle circle = new Circle();

        //when
        Drawer drawer = new Drawer(circle);
        String result = drawer.doDrawing();

        //then
        Assertions.assertEquals("This is a circle", result);
    }

    @Test
    void testDoDrawingWithTriangle() {
        //given
        Triangle triangle = new Triangle();

        //when
        Drawer drawer = new Drawer(triangle);
        String result = drawer.doDrawing();

        //then
        Assertions.assertEquals("This is a triangle", result);
    }
}
