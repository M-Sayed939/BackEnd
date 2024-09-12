package org.example.Java.Loops;

public class DoWhile {
    public static void main(String[] args) {
        //Do-While loop
        int i = 0; //Initialization
        do {
            System.out.println(i); //Output: 0 1 2 3 4
            i++; //Increment
        } while (i < 5); //Condition
        //Nested Do-While loop
        int j = 0;
        do {
            int k = 0;
            do {
                System.out.println(j + " " + k);
                k++;
            } while (k < 3);
            j++;
        } while (j < 3);
    }
}
