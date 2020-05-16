package strategy.strategy1;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void executeStrategy(double num1,double num2){

        if(strategy!= null){
            System.out.println(strategy.doOperation(num1,num2));
        }else{
            System.err.println("Try Again");
        }


    }
}
