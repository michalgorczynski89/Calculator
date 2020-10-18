package com.mgorczyn.calculator;

public class Calculator {

    public int sum(int ... args){
        int sum = 0;
        for(int i : args){
            sum += i;
        }
        return sum;
    }

    public int subtract(int i1, int i2){
        return i1 - i2;
    }
}
