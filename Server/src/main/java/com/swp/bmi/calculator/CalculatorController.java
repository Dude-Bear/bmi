package com.swp.bmi.calculator;

import com.swp.bmi.types.NutritionalStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping(path = "api/v1/calculator/{height}/{weight}")
    public CalculatorResult calculate(@PathVariable int height, @PathVariable int weight) {
        double bmi = (double) weight / ((double) height * (double) height) * 10000; /* * 10000 to turn cm into m*/
        NutritionalStatus status = calculateNutritionalStatus(bmi);
        return new CalculatorResult(height, weight, bmi, status);
    }

    /**
     * Calculates a nutritional status which is based on the WHO.
     * Source: https://www.euro.who.int/en/health-topics/disease-prevention/nutrition/a-healthy-lifestyle/body-mass-index-bmi
     * @param bmi The calculated body-mass-index
     * @return The Nutritional status defined by the WHO.
     */
    private NutritionalStatus calculateNutritionalStatus(double bmi) {
        if (bmi < 18.5) {
            return NutritionalStatus.UnderWeight;
        } else if (bmi <= 24.9) {
            return NutritionalStatus.NormalWeight;
        } else if (bmi <= 29.9) {
            return NutritionalStatus.PreObesity;
        } else if (bmi <= 34.9) {
            return NutritionalStatus.ObesityClassI;
        } else if (bmi <= 39.9) {
            return NutritionalStatus.ObesityClassII;
        } else {
            return NutritionalStatus.ObesityClassIII;
        }
    }
}
