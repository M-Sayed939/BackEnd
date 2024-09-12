package org.example.Java.Functions;

import java.util.ArrayList;

public class dec {
    //Method Declaration


    public int add(int a, int b) {
        //Method Body
        int c = a + b;
        return c;
    }
    /*Access Modifier: public, private, protected, default
    Return Type: int, float, double, void, etc.
    Method Name: 1-> Single word: add(), 2-> Multiple words: myMethod()
     */

    //Types of Methods: 1-> Predefined Method, 2-> User-defined Method

    //Predefined Method
    public void myMethod() {
        System.out.println("The maximum is: " + Math.max(10, 20));
    }
    //User-defined Method
    public static void myMethod2(int num) {
        if (num%2 == 0) System.out.println("Even");
        else System.out.println("Odd");
    }
    public static void main(String[] args) {
        //Method Calling
        dec obj = new dec();
        int result = obj.add(10, 20);
        System.out.println("The sum is: " + result);
        obj.myMethod();
        myMethod2(10);
        //Lambda Expression
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.forEach((n) -> System.out.println(n));
    }
}
