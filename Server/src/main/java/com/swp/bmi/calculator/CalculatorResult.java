package com.swp.bmi.calculator;

public class CalculatorResult {
    private int height;
    private int weight;
    private double result;

    public CalculatorResult(int height, int weight, double result) {
        this.height = height;
        this.weight = weight;
        this.result = result;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
