package org.example.Java.Loops;

public class While {
    public static void main(String[] args) {
        //While loop
        int i = 0; //Initialization
        while (i < 5) { //Condition
            System.out.println(i); //Output: 0 1 2 3 4
            i++; //Increment
        } //End of loop will be n-1 (5-1 = 4)
        //Nested While loop
        int j = 0;
        while (j < 3) {
            int k = 0;
            while (k < 3) {
                System.out.println(j + " " + k);
                k++;
            }
            j++;
        }
    }
}
