package org.example.Java.SOLID;

public class ISP {
    //Before ISP
    public interface Worker {
        void work();
        void eat();
    }
    public static class HumanWorker implements Worker {
        @Override
        public void work() {
            System.out.println("Worker is working");
        }
        @Override
        public void eat() {
            System.out.println("Worker is eating");
        }
    }
    public static class RobotWorker implements Worker {
        @Override
        public void work() {
            System.out.println("Robot is working");
        }
        @Override
        public void eat() {
            //Robot can't eat, but this method is necessary to implement
        }
    }
    //After ISP
    public interface Workable {
        void work();
    }
    public interface Feedable {
        void eat();
    }
    public static class HumanWorkerISP implements Workable, Feedable {
        @Override
        public void work() {
            System.out.println("Worker is working");
        }
        @Override
        public void eat() {
            System.out.println("Worker is eating");
        }
    }
    public static class RobotWorkerISP implements Workable {
        @Override
        public void work() {
            System.out.println("Robot is working");
        }
    }
    public static void main(String[] args) {
        HumanWorkerISP human = new HumanWorkerISP();
        human.work();
        human.eat();
        RobotWorkerISP robot = new RobotWorkerISP();
        robot.work();
    }
}
