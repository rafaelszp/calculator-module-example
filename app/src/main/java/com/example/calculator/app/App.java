package com.example.calculator.app;
import com.example.calculator.base.operation.OperationType;
import com.example.calculator.base.calculator.Calculator;
import com.example.calculator.sum.calculator.SumCalculator;

public class App {
    public static void main(String[] args) {
        
        String type = "sum";
        Double[] operands = new Double[]{1.0,1.0,1.1};
        Calculator calc = App.factory(OperationType.fromString(type));
        var result = calc.calculate(operands);
        System.out.printf("\n\nThe calculated value is %s",result);

    }


    public static Calculator factory(OperationType type){
        switch (type) {
            case SUM: return new SumCalculator();
            default:
                break;
        }
        throw new RuntimeException("invalid operation type");
    }
    
}
