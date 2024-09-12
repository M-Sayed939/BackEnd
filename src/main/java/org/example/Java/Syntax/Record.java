package org.example.Java.Syntax;

import java.util.Objects;

public class Record {
    //Purpose: In many Classes this Data is Immutable
    /*To create a data class with ths following properties:
    1. A private final field for each property
    2. A public getter method for each property
    3. A public constructor that takes a parameter for each property
    4. equals method that returns true if all properties are equal
    5. hashCode method that returns a unique hash based on all properties
    6. toString method that returns a string representation of the object
     */
    private final String name;
    private final int address;
    public Record(String name, int address) {
        this.name = name;
        this.address = address;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (!(obj instanceof Record)) {
            return false;
        } else {
            Record record = (Record) obj;
            return Objects.equals(name, record.name) && Objects.equals(address, record.address);
        }
    }
    @Override
    public String toString() {
        return "Record[" +
                "name='" + name + '\'' +
                ", address=" + address +
                ']';
    }
    //Standard getters
    public String getName() {
        return name;
    }
    public int getAddress() {
        return address;
    }
    //AS Java 14 you can use the record keyword to create a record class
    public record Record2(String name, int address) {
    }
    //constructor can be
    Record2 record2 = new Record2("John", 123);


}
