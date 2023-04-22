package com.example.testing.shape;

public class Square implements Shape {

    private int a;

    @Override
    public void getShape() {
        System.out.println("This is Square");
    }

    @Override
    public void getField() {
        System.out.println("Square field is: " + a * a);
    }
}
