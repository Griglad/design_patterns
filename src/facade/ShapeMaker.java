package facade;

public class ShapeMaker {
    private Shape rectangle;
    private Shape square;
    private Shape circle;
    private Shape polygon;


    public ShapeMaker() {
        rectangle = new Rectangle();
        square = new Square();
        circle = new Circle();

        // define a lambda function for a shape instead of creating a class.
        polygon = () -> System.out.println("Inside polygon's draw method");
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawSquare() {
        square.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawPolygon() {
        polygon.draw();
    }
}
