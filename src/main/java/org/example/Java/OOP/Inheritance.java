package org.example.Java.OOP;

public class Inheritance {
    //Parent class
    public static class Animal {
        public void eat() {
            System.out.println("Animal is eating");
        }
    }

    //Child class
    public static class Dog extends Animal {
        public void bark() {
            System.out.println("Dog is barking");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); //Output: Animal is eating
        dog.bark(); //Output: Dog is barking
    }
}
