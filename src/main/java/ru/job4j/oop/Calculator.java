package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        return sum(a) + multiply(a) + minus(a) + divide(a);
    }

    public static void main(String[] args) {
        int resultSum = sum(10);
        System.out.println("Sum result: " + resultSum);

        int resultMinus = minus(8);
        System.out.println("Minus result: " + resultMinus);

        Calculator calculator = new Calculator();

        int resultMultiply = calculator.multiply(5);
        System.out.println("Multiply result: " + resultMultiply);

        int resultDivide = calculator.divide(10);
        System.out.println("Divide result: " + resultDivide);

        int resultSumAll = calculator.sumAllOperation(7);
        System.out.println("Sum of all operations: " + resultSumAll);
    }
}
