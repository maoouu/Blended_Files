package com.exercises.Codefiles;

public class SinglyLinkedList {

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void add(String data) {
        Node newNode = new Node(data);

        // Check if the list is empty
        if (head == null) {
            // If list is empty,
            // both head and tail will point to new node
            head = newNode;
            tail = newNode;
        } else {
            // newNode will be added after tail such that
            // tail's next will point to newNode
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void add(String index, String data) {
        int position = Integer.parseInt(index);
        Node newNode = new Node(data);
        Node cur = head;
        Node prev = head;

        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        while (cur.next != null && --position > 0) {
            prev = cur;
            cur = cur.next;
        }

        // prev -> newNode -> cur
        prev.next = newNode;
        newNode.next = cur;
    }

    public void display() {
        // Node current will point to head
        Node current = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.print("[");

        while (current != null) {
            String end = current.next == null ? "\"" : "\", ";
            System.out.print("\"" + current.data + end);
            current = current.next;
        }
        System.out.print("]");
        System.out.println();
    }

    public void parseString(String str) {
        try {
            String[] args = str.split(" ");
            if (args.length > 3) {
                System.out.println("Error: Too many arguments.");
            } else {
                switch (args[0].toLowerCase()) {
                    case "add":
                        if (args.length == 3) {
                            add(args[1], args[2]);
                        } else {
                            add(args[1]);
                        }
                        display();
                        break;
                    case "display":
                        display();
                    default:
                        break;
                }
            }
        } catch (Exception e) {
            return;
        }
    }
}
