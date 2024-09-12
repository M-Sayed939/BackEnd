package org.example.Java.DesignPattern.Structural;
/*
Purpose: Adds behavior to objects dynamically by placing them inside wrapper objects that contain the additional behavior.
Use Cases: Used when you want to add functionalities without modifying the structure.
 */
public class Decorator {
    interface Food{
        String prepareFood();
        double foodPrice();
    }
    class VegFood implements Food{
        @Override
        public String prepareFood() {
            return "Veg Food";
        }
        @Override
        public double foodPrice() {
            return 50.0;
        }
    }
    abstract class FoodDecorator implements Food{
        private Food newFood;
        public FoodDecorator(Food newFood) {
            this.newFood = newFood;
        }
        @Override
        public String prepareFood() {
            return newFood.prepareFood();
        }
        @Override
        public double foodPrice() {
            return newFood.foodPrice();
        }
    }
    class NonVegFood extends FoodDecorator{
        public NonVegFood(Food newFood) {
            super(newFood);
        }
        @Override
        public String prepareFood() {
            return super.prepareFood() + " With Roasted Chicken and Chicken Curry  ";
        }
        @Override
        public double foodPrice() {
            return super.foodPrice() + 150.0;
        }
    }
    class ChineeseFood extends FoodDecorator{
        public ChineeseFood(Food newFood) {
            super(newFood);
        }
        @Override
        public String prepareFood() {
            return super.prepareFood() + " With Fried Rice and Manchurian  ";
        }
        @Override
        public double foodPrice() {
            return super.foodPrice() + 65.0;
        }
    }
    public static void main(String[] args) {
        Decorator decorator = new Decorator();
        Food vegFood = decorator.new VegFood();
        System.out.println(vegFood.prepareFood());
        System.out.println(vegFood.foodPrice());
        Food nonVegFood = decorator.new NonVegFood(vegFood);
        System.out.println(nonVegFood.prepareFood());
        System.out.println(nonVegFood.foodPrice());
        Food chineeseFood = decorator.new ChineeseFood(vegFood);
        System.out.println(chineeseFood.prepareFood());
        System.out.println(chineeseFood.foodPrice());
    }
}
