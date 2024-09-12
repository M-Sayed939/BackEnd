package org.example.Java.Syntax;

public class StringTypesComparison {

    public static void main(String[] args) {
        // String: Immutable
        String str = "Hello";
        System.out.println("Initial String: " + str);
        str.concat(" World");  // This will not change the original string
        System.out.println("After concat (String): " + str);  // Still "Hello"

        str = str.concat(" World");  // Must assign the result to a new reference
        System.out.println("After reassignment (String): " + str);  // "Hello World"

        // StringBuffer: Mutable, Thread-safe (Synchronized)
        StringBuffer stringBuffer = new StringBuffer("Hello");
        System.out.println("\nInitial StringBuffer: " + stringBuffer);
        stringBuffer.append(" World");  // Modifies the original string
        System.out.println("After append (StringBuffer): " + stringBuffer);  // "Hello World"

        // StringBuilder: Mutable, Not Thread-safe (Not Synchronized)
        StringBuilder stringBuilder = new StringBuilder("Hello");
        System.out.println("\nInitial StringBuilder: " + stringBuilder);
        stringBuilder.append(" World");  // Modifies the original string
        System.out.println("After append (StringBuilder): " + stringBuilder);  // "Hello World"
    }
}

