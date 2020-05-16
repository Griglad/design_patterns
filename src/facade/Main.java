package facade;

public class Main {


    // This pattern involves a single class which provides simplified methods required by client and delegates calls to methods of existing system classes.
    public static void main(String... args) {


        ShapeMaker maker = new ShapeMaker();
        maker.drawCircle();
        maker.drawRectangle();
        maker.drawSquare();
        maker.drawPolygon();

    }
}
