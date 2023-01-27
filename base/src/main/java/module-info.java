
module base {


  exports com.example.calculator.base.calculator;
  exports com.example.calculator.base.operation;
  exports com.example.calculator.base.spec;

  opens com.example.calculator.base.operation;
  opens com.example.calculator.base.calculator;
  opens com.example.calculator.base.spec;
}
