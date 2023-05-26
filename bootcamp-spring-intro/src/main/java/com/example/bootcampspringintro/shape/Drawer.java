package com.example.bootcampspringintro.shape;

public class Drawer {

    final Shape shape;

    public Drawer(Shape shape) {
        this.shape = shape;
    }

    public String doDrawing() {
        return shape.draw();
    }

}
