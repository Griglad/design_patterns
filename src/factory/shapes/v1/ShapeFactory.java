package factory.shapes.v1;

public class ShapeFactory {


    public Shape create(String type) {


        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (type.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        return null;
    }

    public Shape createWithLambdas(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("CIRCLE")) {
            return () -> System.out.println(type.toUpperCase() + " is created");
        } else if (type.equalsIgnoreCase("RECTANGLE")) {
            return () -> System.out.println(type.toUpperCase() + " is created");
        } else if (type.equalsIgnoreCase("SQUARE")) {
            return () -> System.out.println(type.toUpperCase() + " is created");
        }

        return null;

    }


}
