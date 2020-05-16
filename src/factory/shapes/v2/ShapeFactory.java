package factory.shapes.v2;


public class ShapeFactory {

    public static Shape create(String type) {
        String typeUpper = type.toUpperCase();
        switch (typeUpper) {
            case "CIRCLE":
                return Shape.createCircle();
            case "RECTANGLE":
                return Shape.createRectangle();
            case "SQUARE":
                return Shape.createSquare();
            case "TRIANGLE":
                return Shape.createTriangle();
            default:
                return null;
        }

    }

}
