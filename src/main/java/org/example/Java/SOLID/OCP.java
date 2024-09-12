package org.example.Java.SOLID;

public class OCP {
    //Base class for shapes
    abstract static class Shape {
        abstract double calculateArea();
    }
    static class Rectangle extends Shape {
        private double length;
        private double width;
        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }
        @Override
        double calculateArea() {
            return length * width;
        }
    }
    static class Circle extends Shape {
        private double radius;
        public Circle(double radius) {
            this.radius = radius;
        }
        @Override
        double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

}
