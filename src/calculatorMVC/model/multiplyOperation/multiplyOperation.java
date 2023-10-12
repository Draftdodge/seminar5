package calculatorMVC.model.multiplyOperation;

public class multiplyOperation implements Imultiply{
    public multiplyOperation(double arg1, double arg2){
        this.arg1 = this.arg1;
        this.arg2 = this.arg2;
    }
    double arg1;
    double arg2;

    public double multiply(double arg1, double arg2){
        return arg1 * arg2;
    }

    @Override
    public double multiply() {
        return 0;
    }
}
