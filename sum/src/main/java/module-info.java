
module sum {

  requires base;

  provides com.example.calculator.base.calculator.Calculator 
    with com.example.calculator.sum.calculator.SumCalculator;

  exports com.example.calculator.sum.calculator;

}
