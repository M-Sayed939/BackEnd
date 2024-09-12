package org.example.Java.OOP;

public class Association {
//Association
    public static class Car {
        private String model;
        public Car(String model) {
            this.model = model;
        }
        public String getModel() {
            return model;
        }
    }

    public static class Driver {
        private String name;
        public Driver(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota");
        Driver driver = new Driver("John");
        System.out.println(driver.getName() + " is driving " + car.getModel());
    }

}
