package org.example.Java.SOLID;

public class DIP {
    //Before DIP
    public static class LightBulb {
        public void turnOn() {
            System.out.println("LightBulb: Bulb turned on...");
        }
        public void turnOff() {
            System.out.println("LightBulb: Bulb turned off...");
        }
    }
    public static class Switch {
        private LightBulb lightBulb;
        public Switch(LightBulb lightBulb) {
            this.lightBulb = lightBulb;
        }
        public void flip() {
            lightBulb.turnOn();
            lightBulb.turnOff();
        }
    }
    //After DIP
    public interface Switchable {
        void turnOn();
        void turnOff();
    }
    public static class LightBulbDIP implements Switchable {
        @Override
        public void turnOn() {
            System.out.println("LightBulb: Bulb turned on...");
        }
        @Override
        public void turnOff() {
            System.out.println("LightBulb: Bulb turned off...");
        }
    }
    public static class SwitchDIP {
        private Switchable client;
        public SwitchDIP(Switchable client) {
            this.client = client;
        }
        public void flip() {
            client.turnOn();
            client.turnOff();
        }
    }
    public static void main(String[] args) {
        LightBulbDIP light = new LightBulbDIP();
        SwitchDIP switchDIP = new SwitchDIP(light);
        switchDIP.flip();
    }
}
