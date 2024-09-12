package org.example.Java.OOP;

public class Over {
    // Overloading: same method name but different parameters
    public void display(int a) {
        System.out.println("Integer: " + a);
    }
    public void display(int a, int b) {
        System.out.println("Integer: " + a + " and " + b);
    }
    static class ParentClass{
        public void display(){
            System.out.println("Parent class");
        }
    }
    static class ChildClass extends ParentClass{
        @Override
        public void display(){
            System.out.println("Child class");
        }
    }
    public static void main(String[] args) {
        Over obj = new Over();
        obj.display(1); //Single Parameter
        obj.display(1, 2); // Overloaded with two parameters
        //Overriding
        ParentClass obj1 = new ParentClass();
        obj1.display(); //Calls Parent class method
        ChildClass obj2 = new ChildClass();
        obj2.display(); //Calls overridden method in Child class
    }
}
// Overloading at Compile time
// Overriding at Run time

