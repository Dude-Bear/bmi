package com.swp.bmi.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping(path = "api/v1/calculator/{height}/{weight}")
    public CalculatorResult calculate(@PathVariable int height, @PathVariable int weight) {
        return new CalculatorResult(height, weight);
    }
}
