package org.example.Java.OOP;

public class Abstract {
    //Abstract class
    public static abstract class Animal {
        public abstract void eat();
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
        dog.eat(); //Output: Dog is eating
        Cat cat = new Cat();
        cat.eat(); //Output: Cat is eating
    }
}
