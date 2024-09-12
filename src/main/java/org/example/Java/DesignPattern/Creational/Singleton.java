package org.example.Java.DesignPattern.Creational;

/*
Purpose: Ensures that a class has only one instance and provides a global point of access to it.
Use Cases: Used in logging, caching, thread pools, and database connections.
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2); //Output: true
    }

}
