package com.Maoouu.CalculatorApp;

public class Calculator {
    private static String num1;
    private static String num2;
    private static String operator;
    private static String result;

    public Calculator parseString(String str) {
        String[] strings = str.split(" ");
        num1 = strings[0];
        num2 = strings[2];
        operator = strings[1];

        return this;
    }

    public Calculator calculate() {
        String equation = String.format("%s %s %s = ", num1, operator, num2);

        switch (operator) {
            case "+":
                result = add(equation);
                break;
            case "-":
                result = subtract(equation);
                break;
            case "*":
                result = multiply(equation);
                break;
            case "/":
                result = divide(equation);
                break;
            default:
                result = "Error";
                break;
        }
        return this;
    }

    public String getResult() {
        return result;
    }

    private String add(String equation) {
        int x = Integer.parseInt(num1);
        int y = Integer.parseInt(num2);
        return equation.concat(Integer.toString(x + y));
    }

    private String subtract(String equation) {
        int x = Integer.parseInt(num1);
        int y = Integer.parseInt(num2);
        return equation.concat(Integer.toString(x - y));
    }

    private String multiply(String equation) {
        int x = Integer.parseInt(num1);
        int y = Integer.parseInt(num2);
        return equation.concat(Integer.toString(x * y));
    }

    private String divide(String equation) {
        int x = Integer.parseInt(num1);
        int y = Integer.parseInt(num2);
        try {
            return equation.concat(Integer.toString(x / y));
        } catch (ArithmeticException e) {
            return equation.concat("Cannot divide by zero");
        }
    }
}
