package com.exercises.Codefiles;

import java.util.Scanner;

public class LinkedListTest {

    private static SinglyLinkedList sList;
    private static Scanner in;
    private static boolean exit = false;

    public static void main(String[] args) {
        start();
        printLine("Exited Successfully");
    }

    private static void start() {
        printLine("== Dale's Singly LinkedList ==");
        printLine("Enter 'exit' to exit the application.");
        initSinglyLinkedList();
        initConsole();
    }

    private static void initConsole() {
        while (!exit) {
            String user = input("> ").trim();
            if (user.equals("exit")) {
                close();
            }
            sList.parseString(user);
        }
    }

    private static String input(String cursor) {
        print(cursor);
        return in.nextLine();
    }

    private static void close() {
        exit = true;
        in.close();
    }

    private static void initSinglyLinkedList() {
        sList = new SinglyLinkedList();
        in = new Scanner(System.in);
    }

    private static void printLine(String str) {
        System.out.println(str);
    }

    private static void print(String str) {
        System.out.print(str);
    }

}
