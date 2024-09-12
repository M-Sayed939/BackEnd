package org.example.Java.DataStructure;

public class Array {
    //Array is a collection of similar data types
    //Array is a fixed size data structure
    public static void main(String[] args) {
        //Declaration of Array
        int[] arr = new int[5];
        //Initialization of Array
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        //Accessing elements of Array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
