package org.example.Java.DesignPattern.Creational;
/*
Purpose: Defines an interface for creating objects but lets subclasses alter the type of objects that will be created.
Use Cases: Used when the exact types of objects are determined at runtime.
 */
public class Factory {
    interface Shape {
        void draw();
    }
    public static class Circle implements Shape {
        @Override
        public void draw() {
            System.out.println("Circle drawn");
        }
    }
    public static class ShapeFactory {
        public Shape getShape(String shapeType) {
            if (shapeType == null) {
                return null;
            }
            if (shapeType.equalsIgnoreCase("CIRCLE")) {
                return new Circle();
            }
            return null;
        }
    }
}
