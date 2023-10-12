package calculatorMVC.model.substractOperation;

public class substractOperation implements ISubstract {
    public substractOperation(double arg1, double arg2) {
        this.arg1 = this.arg1;
        this.arg2 = this.arg2;
    }

    double arg1;
    double arg2;

    public double substract() {
        return arg1 - arg2;
    }
}