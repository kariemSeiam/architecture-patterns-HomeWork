package com.alyndroid.architecturepatternstutorialshomework.model;

public class NumberModel {
    private final int firstNum;
    private final int secondNum;

    public NumberModel(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public int getFirstNum() {
        return firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }
}
