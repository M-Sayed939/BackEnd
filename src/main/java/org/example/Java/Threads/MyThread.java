package org.example.Java.Threads;

public class MyThread extends Thread{
    public void run(){
        System.out.println("Thread is running...");
    }
    public static class MyRunnable implements Runnable{
        public void run(){
            System.out.println("Runnable is running...");
        }
    }
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        Thread r1 = new Thread(new MyRunnable());
        r1.start();
        t1.start();
    }
    //Multi-threading
    public static class MultiThreading implements Runnable{
        public static void main(String[] args) {
            Thread MT1 = new Thread("Demo Thread 1");
            Thread MT2 = new Thread("Demo Thread 2");
            MT1.start();
            MT2.start();
            System.out.println("Thread 1 is alive: " + MT1.isAlive());
            System.out.println("Thread 2 is alive: " + MT2.isAlive());
            System.out.println("Threads Name are:" + MT1.getName()+ " and " + MT2.getName());
            System.out.println("Threads Priority are:" + MT1.getPriority()+ " and " + MT2.getPriority());

        }
        @Override
        public void run() {

        }
    }


}
