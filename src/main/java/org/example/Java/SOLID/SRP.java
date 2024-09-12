package org.example.Java.SOLID;

public class SRP {
    //Before SRP
    public static class Payment {
        void processPayment() {
            //Payment processing
        }
        void generateReceipt() {
            //Receipt generation
        }
    }
    //After SRP
    public static class PaymentProcessor {
        void processPayment() {
            //Payment processing
        }
    }
    public static class ReceiptGenerator {
        void generateReceipt() {
            //Receipt generation
        }
    }
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.processPayment();
        payment.generateReceipt();
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment();
        ReceiptGenerator receiptGenerator = new ReceiptGenerator();
        receiptGenerator.generateReceipt();
    }
}
