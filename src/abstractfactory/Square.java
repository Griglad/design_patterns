package abstractfactory;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Normal Square is created");
    }
}