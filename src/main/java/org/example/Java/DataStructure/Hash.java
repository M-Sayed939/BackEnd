package org.example.Java.DataStructure;

public class Hash {
    // Hash Table implementation
    private static class DataItem {
        private int data;
        public DataItem(int i) {
            data = i;
        }
        public int getKey() {
            return data;
        }
    }
    private final int SIZE = 128;
    private DataItem[] hashArray;
    public Hash() {
        hashArray = new DataItem[SIZE];
    }
public void displayTable() {
        System.out.print("Table: ");
        for (int j = 0; j < SIZE; j++) {
            if (hashArray[j] != null) {
                System.out.print(hashArray[j].getKey() + " ");
            } else {
                System.out.print("** ");
            }
        }
        System.out.println("");
    }
    public int hashFunc(int key) {
        return key % SIZE;
    }
    public void insert(DataItem item) {
        int key = item.getKey();
        int hashVal = hashFunc(key);
        while (hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1) {
            ++hashVal;
            hashVal %= SIZE;
        }
        hashArray[hashVal] = item;
    }
    public DataItem delete(int key) {
        int hashVal = hashFunc(key);
        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getKey() == key) {
                DataItem temp = hashArray[hashVal];
                hashArray[hashVal] = new DataItem(-1);
                return temp;
            }
            ++hashVal;
            hashVal %= SIZE;
        }
        return null;
    }
    public DataItem find(int key) {
        int hashVal = hashFunc(key);
        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getKey() == key) {
                return hashArray[hashVal];
            }
            ++hashVal;
            hashVal %= SIZE;
        }
        return null;
    }
    public static void main(String[] args) {
        DataItem aDataItem;
        int aKey;
        int size = 128;
        Hash theHashTable = new Hash();
        for (int j = 0; j < size; j++) {
            aKey = (int) (java.lang.Math.random() * 1000);
            aDataItem = new DataItem(aKey);
            theHashTable.insert(aDataItem);
        }
        theHashTable.displayTable();
        aKey = 50;
        aDataItem = theHashTable.find(aKey);
        if (aDataItem != null) {
            System.out.println("Found " + aKey);
        } else {
            System.out.println("Could not find " + aKey);
        }
        aKey = 99;
        aDataItem = new DataItem(aKey);
        theHashTable.insert(aDataItem);
        theHashTable.displayTable();
        theHashTable.delete(aKey);
        theHashTable.displayTable();
    }
}
