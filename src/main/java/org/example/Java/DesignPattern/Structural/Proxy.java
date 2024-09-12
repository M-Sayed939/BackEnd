package org.example.Java.DesignPattern.Structural;
/*
Purpose: Provides a surrogate or placeholder for another object to control access to it.
Use Cases: Used in lazy initialization, access control, logging, etc.
 */
public class Proxy {
interface Image {
        void display();
    }
    public static class RealImage implements Image {
        private final String fileName;
        public RealImage(String fileName) {
            this.fileName = fileName;
            loadFromDisk(fileName);
        }
        private void loadFromDisk(String fileName) {
            System.out.println("Loading " + fileName);
        }
        @Override
        public void display() {
            System.out.println("Displaying " + fileName);
        }
    }
    public static class ProxyImage implements Image {
        private RealImage realImage;
        private final String fileName;
        public ProxyImage(String fileName) {
            this.fileName = fileName;
        }
        @Override
        public void display() {
            if (realImage == null) {
                realImage = new RealImage(fileName);
            }
            realImage.display();
        }
    }
    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");
        image.display();
        System.out.println();
        image.display();
    }
}
