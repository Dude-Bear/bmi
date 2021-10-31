package com.swp.bmi.calculator;

import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {
    /**
     * Returns the body-mass-index.
     *
     * @param height Height in cm
     * @param weight Weight in kg
     * @return Calculation result
     */
    @RequestMapping(value = "/api/v1/calculator", method = RequestMethod.GET)
    public CalculatorResult calculate(@RequestParam("height") int height, @RequestParam("weight") int weight) {
        return new CalculatorResult(height, weight);
    }
}
