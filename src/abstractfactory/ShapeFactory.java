package abstractfactory;

public class ShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(String shapeType) {
        return shapeType.equalsIgnoreCase("rectangle")?
                new Rectangle():
                (shapeType.equalsIgnoreCase("square")?
                        new Square() :null);
    }
}
