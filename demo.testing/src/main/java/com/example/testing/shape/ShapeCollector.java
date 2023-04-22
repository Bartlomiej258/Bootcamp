package com.example.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    public List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape){
        shapes.add(shape);
    }
    public void removeFigure(Shape shape) {
        shapes.remove(shape);
    }
    public Shape getFigure(int n) {
        return shapes.get(n);
    }
    public void showFigure() {

    }
}
