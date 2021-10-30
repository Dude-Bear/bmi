package com.swp.bmi.calculator;

import com.swp.bmi.types.NutritionalStatus;

public class CalculatorResult {
    private int height;
    private int weight;
    private double result;
    private NutritionalStatus status;

    public CalculatorResult(int height, int weight, double result, NutritionalStatus status) {
        this.height = height;
        this.weight = weight;
        this.result = result;
        this.status = status;
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

    public NutritionalStatus getStatus() {
        return status;
    }

    public void setStatus(NutritionalStatus status) {
        this.status = status;
    }
}
