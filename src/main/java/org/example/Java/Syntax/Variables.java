package org.example.Java.Syntax;

public class Variables {
    static int Variable = 10; // Static variable
    void myMethod() {
        int myVariable = 20; // Local variable
    }
    public static void main(String[] args) {
        int _Variable = 30; // Instance variable

        int a = 10;
        int b = 20;
        int c = a + b; //Arithmetic operator

        float f = a; //Widening
        int d = (int) f; //Narrowing
        byte e = (byte) d; //Overflow
    }
}
