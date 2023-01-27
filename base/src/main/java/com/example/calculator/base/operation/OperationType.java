package com.example.calculator.base.operation;
public enum OperationType {

  SUM,
  SUB,
  MUL,
  DIV;


  public static OperationType fromString(String typestr){
    switch(typestr.toUpperCase()){
      case "SUM": return OperationType.SUM;
      case "SUB": return OperationType.SUB;
      case "MUL": return OperationType.MUL;
      case "DIV": return OperationType.DIV;
      default:
        throw new IllegalArgumentException("type not valid");
    }
  }

}
