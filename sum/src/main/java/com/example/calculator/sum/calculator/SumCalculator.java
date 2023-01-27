package com.example.calculator.sum.calculator;

import java.util.Arrays;

import com.example.calculator.base.calculator.Calculator;
import com.example.calculator.base.spec.Spec;
import com.example.calculator.sum.spec.SumSpec;

public class SumCalculator implements Calculator {

    @Override
    public Double calculate(Double... operands) {
        Spec spec = new SumSpec();
        if (!spec.isValid(operands)){
            return Double.MIN_VALUE;
        }
        var ops = Arrays.asList(operands);
        Double sum =  ops.stream()
        .reduce(0.0d,(sub,el)-> sub+el);
        return sum;
    }

    
}
