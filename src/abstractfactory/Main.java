package abstractfactory;

public class Main {


    /*Abstract Factory patterns work around a super-factory which creates other factories.
    This factory is also called as factory of factories.
    This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
     */
    public static void main(String ... args){


         AbstractFactory factory = FactoryProducer.getFactory(true);

         factory.getShape("rectangle").draw();
    }
}
