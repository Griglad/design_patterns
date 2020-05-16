package strategy.strategy1;

public class OperationDevide implements Strategy {
    @Override
    public double doOperation(double num1, double num2) {
        return num1/num2;
    }
    public static double doOperations(double num1,double num2){
        return num1/num2;
    }
}
