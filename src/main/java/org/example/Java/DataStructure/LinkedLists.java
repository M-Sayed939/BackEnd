package org.example.Java.DataStructure;

public class LinkedLists {
    // Single Linked List
    public static class SingleLinkedList {
        Node head;

        public static class Node {
            int data;
            Node next;

            Node(int d) {
                data = d;
                next = null;
            }
        }

        public void push(int new_data) {
            Node new_node = new Node(new_data);
            new_node.next = head;
            head = new_node;
        }

        public void insertAfter(Node prev_node, int new_data) {
            if (prev_node == null) {
                System.out.println("The given previous node cannot be null");
                return;
            }
            Node new_node = new Node(new_data);
            new_node.next = prev_node.next;
            prev_node.next = new_node;
        }

        public void append(int new_data) {
            Node new_node = new Node(new_data);
            if (head == null) {
                head = new Node(new_data);
                return;
            }
            new_node.next = null;
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
            return;
        }

        public void printList() {
            Node tnode = head;
            while (tnode != null) {
                System.out.print(tnode.data + " ");
                tnode = tnode.next;
            }
        }
    }
    // Doubly Linked List
    public static class DoublyLinkedList {
        Node head;

        public static class Node {
            int data;
            Node prev;
            Node next;

            Node(int d) {
                data = d;
                prev = null;
                next = null;
            }
        }

        public void push(int new_data) {
            Node new_node = new Node(new_data);
            new_node.next = head;
            new_node.prev = null;
            if (head != null) {
                head.prev = new_node;
            }
            head = new_node;
        }

        public void insertAfter(Node prev_node, int new_data) {
            if (prev_node == null) {
                System.out.println("The given previous node cannot be null");
                return;
            }
            Node new_node = new Node(new_data);
            new_node.next = prev_node.next;
            prev_node.next = new_node;
            new_node.prev = prev_node;
            if (new_node.next != null) {
                new_node.next.prev = new_node;
            }
        }

        public void append(int new_data) {
            Node new_node = new Node(new_data);
            Node last = head;
            new_node.next = null;
            if (head == null) {
                new_node.prev = null;
                head = new_node;
                return;
            }
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
            new_node.prev = last;
        }

        public void printList(Node node) {
            Node last = null;
            System.out.println("Traversal in forward Direction");
            while (node != null) {
                System.out.print(node.data + " ");
                last = node;
                node = node.next;
            }
            System.out.println();
            System.out.println("Traversal in reverse direction");
            while (last != null) {
                System.out.print(last.data + " ");
                last = last.prev;
            }
        }
    }
    // Circular Linked List
    public static class CircularLinkedList{
        Node head;

        public static class Node {
            int data;
            Node next;

            Node(int d) {
                data = d;
                next = null;
            }
        }

        public void push(int new_data) {
            Node new_node = new Node(new_data);
            Node temp = head;
            new_node.next = head;
            if (head != null) {
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = new_node;
            } else {
                new_node.next = new_node;
            }
            head = new_node;
        }

        public void insertAfter(Node prev_node, int new_data) {
            if (prev_node == null) {
                System.out.println("The given previous node cannot be null");
                return;
            }
            Node new_node = new Node(new_data);
            new_node.next = prev_node.next;
            prev_node.next = new_node;
        }

        public void append(int new_data) {
            Node new_node = new Node(new_data);
            Node temp = head;
            new_node.next = null;
            if (head == null) {
                new_node.next = new_node;
                head = new_node;
            } else {
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = new_node;
                new_node.next = head;
            }
        }

        public void printList() {
            Node temp = head;
            if (head != null) {
                do {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                } while (temp != head);
            }
        }
        public static void main(String[] args) {
            SingleLinkedList sll = new SingleLinkedList();
            sll.append(6);
            sll.push(7);
            sll.push(1);
            sll.append(4);
            sll.insertAfter(sll.head.next, 8);
            System.out.println("Contents of Single Linked List");
            sll.printList();
            DoublyLinkedList dll = new DoublyLinkedList();
            dll.append(6);
            dll.push(7);
            dll.push(1);
            dll.append(4);
            dll.insertAfter(dll.head.next, 8);
            System.out.println("Contents of Doubly Linked List");
            dll.printList(dll.head);
            CircularLinkedList cll = new CircularLinkedList();
            cll.append(6);
            cll.push(7);
            cll.push(1);
            cll.append(4);
            cll.insertAfter(cll.head.next, 8);
            System.out.println("Contents of Circular Linked List");
            cll.printList();
        }
    }
}
