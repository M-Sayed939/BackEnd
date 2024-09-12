package org.example.Java.SOLID;

public class LSP {
    //Base class Bird
    static class Bird {
        void fly() {
            System.out.println("Bird is flying");
        }
    }

    static class Ostrich extends Bird {
        @Override
        void fly() {
            throw new UnsupportedOperationException("Ostrich cannot fly");
        }
    }

    static class Sparrow extends Bird {
        @Override
        void fly() {
            System.out.println("Sparrow is flying");
        }
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
        Sparrow sparrow = new Sparrow();
        sparrow.fly();
        Ostrich ostrich = new Ostrich();
        ostrich.fly();
    }
}
