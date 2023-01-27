package com.example.calculator.sum.spec;

import java.util.Arrays;
import java.util.function.Predicate;

import com.example.calculator.base.spec.Spec;

public class SumSpec implements Spec{

    @Override
    public boolean isValid(Double... operands) {
        Predicate<Double> allNonNull = d -> d == null;
        var list =  Arrays.asList(operands);
        var count = list.stream().filter(allNonNull).count();
        return count == 0 ;
    }
    
}
