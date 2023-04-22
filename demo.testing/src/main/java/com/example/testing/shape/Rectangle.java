package com.example.testing.shape;

public class Rectangle implements Shape {

    private int a;
    private int b;

    @Override
    public void getShape() {
        System.out.println("This is a Rectangle");
    }

    @Override
    public void getField() {
        System.out.println("Rectangle field is: " + (a * b));
    }
}
