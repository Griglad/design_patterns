package factory.shapes.v1;

public class App {


    // Define an interface or abstract class for creating an object but let the subclasses decide which class to instantiate.
    public static void main(String[] args) {



        ShapeFactory factory = new ShapeFactory();


       Shape shape1 =  factory.create("Circle");
       Shape shape2 = factory.createWithLambdas("Circle");

       if(shape1 != null){
           shape1.draw();
       }
       if(shape2 != null){
           shape2.draw();
       }



    }
}
