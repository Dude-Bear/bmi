package com.swp.bmi.calculator;

import com.swp.bmi.types.NutritionalStatus;

public class CalculatorResult {
    private int height;
    private int weight;
    private double result;
    private NutritionalStatus status;

    public CalculatorResult(int height, int weight) {
        this.height = height;
        this.weight = weight;
        this.result = calculateBodyMassIndex();
        this.status = calculateNutritionalStatus();
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

    private double calculateBodyMassIndex(){
        return (double) weight / ((double) height * (double) height) * 10000; /* * 10000 to turn cm into m*/
    }

    /**
     * Calculates a nutritional status which is based on the WHO.
     * Source: https://www.euro.who.int/en/health-topics/disease-prevention/nutrition/a-healthy-lifestyle/body-mass-index-bmi
     * @return The Nutritional status defined by the WHO.
     */
    private NutritionalStatus calculateNutritionalStatus() {
        if (result < 18.5) {
            return NutritionalStatus.UnderWeight;
        } else if (result <= 24.9) {
            return NutritionalStatus.NormalWeight;
        } else if (result <= 29.9) {
            return NutritionalStatus.PreObesity;
        } else if (result <= 34.9) {
            return NutritionalStatus.ObesityClassI;
        } else if (result <= 39.9) {
            return NutritionalStatus.ObesityClassII;
        } else {
            return NutritionalStatus.ObesityClassIII;
        }
    }
}
