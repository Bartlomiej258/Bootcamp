package com.example.demo_testing.shape;

import com.example.testing.shape.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("test Shape Collector class")
public class ShapeCollectorTestSuite {

    @Nested
    @DisplayName("tests for shape methods")
    class TestShapeCollector {

        @Test
        void testAddFigure() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            Shape circle = new Circle();

            //When
            collector.addFigure(circle);

            //Then
            Assertions.assertEquals(1, collector.shapes.size());
        }

        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            Shape square = new Square();
            Shape circle = new Circle();

            //When
            collector.shapes.add(square);
            collector.shapes.add(circle);
            collector.removeFigure(circle);

            //Then
            Assertions.assertEquals(1, collector.shapes.size());
        }

        @Test
        void getFigure() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            Shape circle = new Circle();
            Shape square = new Square();
            Shape rectangle = new Rectangle();

            //When
            collector.addFigure(circle);
            collector.addFigure(square);
            collector.addFigure(rectangle);

            //Then
            Assertions.assertEquals(circle, collector.shapes.get(0));
        }

        @Test
        void showFigure() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            Shape circle = new Circle();
            Shape square = new Square();
            Shape rectangle = new Rectangle();

            //When
            collector.addFigure(circle);
            collector.addFigure(square);
            collector.addFigure(rectangle);

            int size = collector.shapes.size();

            //Then
            Assertions.assertEquals(3, size);
        }

    }

}
