package org.example.Java.DesignPattern.Behavioral;

/*
Purpose: Defines a family of algorithms, encapsulates each one, and makes them interchangeable.
Use Cases: Used in systems where multiple algorithms or strategies can be applied, such as sorting.
 */

public class Strategy {
    interface PaymentStrategy {
        void pay(int amount);
    }

    static class CreditCardStrategy implements PaymentStrategy {
        public void pay(int amount) {
            System.out.println(amount + " paid using Credit Card");
        }
    }

    static class ShoppingCart {
        private PaymentStrategy paymentStrategy;

        public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
            this.paymentStrategy = paymentStrategy;
        }

        public void checkout(int amount) {
            paymentStrategy.pay(amount);
        }

        public static void main(String[] args) {
            ShoppingCart cart = new ShoppingCart();
            cart.setPaymentStrategy(new CreditCardStrategy());
            cart.checkout(100);
        }
    }
}
