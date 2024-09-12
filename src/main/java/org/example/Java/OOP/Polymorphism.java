package org.example.Java.OOP;

public class Polymorphism {
    //Parent class
    public static class Animal {
        public void eat() {
            System.out.println("Animal is eating");
        }
    }

    //Child class
    public static class Dog extends Animal {
        public void eat() {
            System.out.println("Dog is eating");
        }
    }
    public static class Cat extends Animal {
        public void eat() {
            System.out.println("Cat is eating");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); //Output: Animal is eating
        Cat cat = new Cat();
        cat.eat(); //Output: Animal is eating
    }
}
