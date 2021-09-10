package com.example.ObjectOriented;

import java.util.Scanner;

import com.Maoouu.CalculatorApp.Calculator;

public class Calculate {

    private static Calculator calc;
    private static Scanner in;

    public static void main(String[] args) {
        start();
        print("Exited Successfully");
    }

    private static void start() {
        print("=== One-Line Basic Calculator ===");
        print("Enter 'exit' to exit calculator.");
        initCalculator();
        startConsole();
    }

    private static void startConsole() {
        while (true) {
            String userInput = input("> ");
            if (userInput.equals("exit")) {
                close();
                break;
            }
            String result = calc.parseString(userInput).calculate().getResult();
            print(result + "\n");
        }
    }

    private static void initCalculator() {
        calc = new Calculator();
        in = new Scanner(System.in);
    }

    private static void print(String str) {
        System.out.println(str);
    }

    private static String input(String str) {
        System.out.print("> ");
        return in.nextLine();
    }

    private static void close() {
        print("Exiting...");
        in.close();
    }
}
