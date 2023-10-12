package calculatorMVC.model.sumOperation;

public class sumOperation implements IsumOperation{
    public sumOperation(double arg1, double arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
    }
    double arg1;
    double arg2;

    public double sum(){
        return arg1 + arg2;
    }
}
