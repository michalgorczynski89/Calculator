package com.mgorczyn.calculator;

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int i1 = 10;
        int i2 = 14;
        int i3 = 18;
        System.out.println("Ints sum: " + calc.sum(i1,i2,i3));
        System.out.println("i1 - i2: " + calc.subtract(i1,i2));
    }
}
