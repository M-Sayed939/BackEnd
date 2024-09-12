package org.example.Java.Syntax;

public class Basic {

    //Single line comment

    /* Multi
    line
     */


    //Java Identifiers

    //All Identifiers must begin with a letter (A to Z or a to z), currency character ($) or an underscore (_).

    //Java Keywords cannot be used as identifiers.

    /*Keywords(abstract, class, extends,
                 implements, new, this,
                 assert, const, false, instanceof, null,
                 throw, boolean, continue, final, int,
                 package, throws, break, default, finally,
                  interface, private, transient,
                   byte, do, float, long, protected,
                    true, case, double, for, native,
                     public, try, catch, else, goto,
                      short, void, char, enum, if, static,
                       volatile, class, extends, implements,
                        new, this)
     */
    int $myVariable = 10;
    int age = 20;
    String name = "John";
    String _name = "John";
    String $name = "John";
    Boolean isTrue = true;
    Boolean isFalse = false;

    //Java Modifiers
    //Access Modifiers: default, public, protected, private
    //Non-access Modifiers: final, abstract, strictfp
    public void myMethod() {
        System.out.println("Hello world!");
    }


    //Java Data Types
    //Primitive Data Types: byte, short, int, long, float, double, boolean, char
    //Non-Primitive Data Types: String, Array, Class
    byte myByte = 100;
    short myShort = 5000;
    int myInt = 100000;
    long myLong = 1000000000;
    float myFloat = 100.0f;
    double myDouble = 100.0;
    boolean myBoolean = true;
    char myChar = 'A';
    String myString = "Hello";

    public void myMethod2() {
        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(myDouble);
        System.out.println(myBoolean);
        System.out.println(myChar);
        System.out.println(myString);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        byte x;
        int a = 270;
        double b = 128.128;
        System.out.println("int converted to byte");
        x = (byte) a;
        System.out.println("a and x " + a + " " + x);
        System.out.println("double converted to int");
        a = (int) b;
        System.out.println("b and a " + b + " " + a);
        System.out.println("\ndouble converted to byte");
        x = (byte) b;
        System.out.println("b and x " + b + " " + x);
    }
}
