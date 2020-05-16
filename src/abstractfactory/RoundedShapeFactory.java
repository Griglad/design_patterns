package abstractfactory;

public class RoundedShapeFactory extends AbstractFactory {


    @Override
    Shape getShape(String shapeType) {
        return shapeType.equalsIgnoreCase("rectangle")?new RoundedRectangle():(shapeType.equalsIgnoreCase("square")?new RoundedSquare():null);
    }
}
