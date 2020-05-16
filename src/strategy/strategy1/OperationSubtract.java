package strategy.strategy1;

public class OperationSubtract implements Strategy  {


    public static double doOperations(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double doOperation(double num1, double num2) {
        return num1 - num2;
    }
}
