package org.example.Java.Loops;

public class For {
    public static void main(String[] args) {
        //For loop
        for (int i = 0; i < 5; i++) { //Initialization, Condition, Increment/Decrement
            System.out.println(i); //Output: 0 1 2 3 4
        } //End of loop will be n-1 (5-1 = 4)
        //Nested For loop
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(i + " " + j);
            }
        }
        //For-each loop
        int[] numbers = {10, 20, 30, 40, 50};
        for (int number : numbers) {
            System.out.println(number);
        }
        //Labelled For loop
        aa:
        for (int i = 0; i < 3; i++) {
            bb:
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    break aa;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
