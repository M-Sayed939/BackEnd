package org.example.Java.OOP;

public class Encapsulation {
    //Encapsulation
    public static class Student {
        private String name;
        private int age;
        private String address;

        //Getter and Setter methods
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John");
        student.setAge(25);
        student.setAddress("123 Main St, New York, NY");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Address: " + student.getAddress());
    }
}
