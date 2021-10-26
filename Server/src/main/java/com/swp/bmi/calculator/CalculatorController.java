package com.swp.bmi.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping(path = "api/v1/calculator/{height}/{weight}")
    public CalculatorResult calculate(@PathVariable int height, @PathVariable int weight) {
        double bmi = (double) weight / ((double) height * (double) height) * 10000; /* * 10000 to turn cm into m*/
        return new CalculatorResult(height, weight, bmi);
    }
}
