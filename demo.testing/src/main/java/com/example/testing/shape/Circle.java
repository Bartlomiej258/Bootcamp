package com.example.testing.shape;

public class Circle implements Shape {

    private final double PI = Math.PI;
    private int radius;

    @Override
    public void getShape() {
        System.out.println("this is a Circle");
    }

    @Override
    public void getField() {
        System.out.println("Circle field is: " + PI * (radius * radius));
    }
}
