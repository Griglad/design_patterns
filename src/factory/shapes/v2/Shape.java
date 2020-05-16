package factory.shapes.v2;
@FunctionalInterface
public interface Shape {

    void create();

    static Shape createRectangle() {
        return () -> System.out.println("New Rectangle is created");

    }

    static Shape createTriangle() {
        return () -> System.out.println("New Triangle is created");

    }

    static Shape createCircle() {
        return () -> System.out.println("New Circle is created");

    }

    static Shape createSquare() {

        return () -> System.out.println("New Square is created");

    }

}
