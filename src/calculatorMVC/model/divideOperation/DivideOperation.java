package calculatorMVC.model.divideOperation;

public class DivideOperation implements IDivide {
    public DivideOperation(double arg1, double arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    double arg1;
    double arg2;

    public double divide() {
        return arg1 / arg2;
    }
}
