package calculatorMVC.model;

import calculatorMVC.model.divideOperation.DivideOperation;
import calculatorMVC.model.divideOperation.IDivide;
import calculatorMVC.model.multiplyOperation.Imultiply;
import calculatorMVC.model.multiplyOperation.multiplyOperation;
import calculatorMVC.model.substractOperation.ISubstract;
import calculatorMVC.model.substractOperation.substractOperation;
import calculatorMVC.model.sumOperation.IsumOperation;
import calculatorMVC.model.sumOperation.sumOperation;

public class CalculationLayer {
    public double sum(double a, double b) {
        IsumOperation sumOperation = new sumOperation(a, b);
        return sumOperation.sum();
    }

    public double subtract(double a, double b) {
        ISubstract substractOperation = new substractOperation(a, b);
        return substractOperation.substract();
    }

    public double multiply(double a, double b) {
        Imultiply multiplyOperation = new multiplyOperation(a, b);
        return multiplyOperation.multiply();
    }

    public double divide(double a, double b) {
        IDivide divideOperation = new DivideOperation(a, b);
        return divideOperation.divide();
    }
}