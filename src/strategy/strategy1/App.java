package strategy.strategy1;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class App {


    // In this design pattern the behaviour changes at runtime
    public static void main(String ... args) {


        // implementation with method reference
        Strategy strategy1 = OperationAdd::doOperations;
        Context context1 = new Context(strategy1);
       System.out.println("Method Reference Strategy");
       context1.executeStrategy(50,10);


        //implementation with lambdas
        Strategy lambdaStrategy = (num1,num2)-> num1 *num2;
        Context context2 = new Context(lambdaStrategy);
        System.out.println("Lambda Strategy");
        context2.executeStrategy(50,10);


        System.out.println("----------- Normal implementation -------------------");

        //Normal implementation
        // In this place i can change the behaviour.
        Context context3 = new Context(new OperationMultiply());
        context3.executeStrategy(50,10);








    }
}
