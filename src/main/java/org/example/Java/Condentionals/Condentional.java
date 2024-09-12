package org.example.Java.Condentionals;

public class Condentional {
    public static void Weather(String myDay){
        //If-else statement
        if (myDay == "Sunny") { //Condition
            System.out.println("It's a sunny day!"); //Decision

        } else if (myDay == "Rainy") {// 2nd condition
            System.out.println("It's a rainy day!");

        } else if (myDay == "Cloudy") { // 3rd condition
            System.out.println("It's a cloudy day!");

        } else { //Default Decision
            System.out.println("Invalid weather!");

        }
    }
    public static void WeatherSwitch(String myDay){
        //Switch statement
        switch (myDay) {
            case "Sunny":
                System.out.println("It's a sunny day!");
                break;
            case "Rainy":
                System.out.println("It's a rainy day!");
                break;
            case "Cloudy":
                System.out.println("It's a cloudy day!");
                break;
            default:
                System.out.println("Invalid weather!");
                break;
        }
    }
}
