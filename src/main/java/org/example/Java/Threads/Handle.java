package org.example.Java.Threads;

public class Handle {
    private final String name;
    public Handle(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public synchronized void call(Handle caller){
        System.out.println(this.getName()+ " he asked to call me " + caller.getName());
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        caller.call(this);
    }
    public static void main(String[] args) {
        Handle caller1 = new Handle("caller-1");
        Handle caller2 = new Handle("caller-2");
        new Thread(new Runnable() {
            public void run(){
                caller1.call(caller2);
            }
        }).start();
        new Thread(new Runnable() {
            public void run(){
                caller2.call(caller1);
            }
        }).start();
    }
}
