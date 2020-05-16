package factory.computer;

public class Main {
    public static void main(String[] args) {

        Computer pc = ComputerFactory.getComputer("server","2 GB","500 GB","2.4 GHz");

        System.out.println(pc);
    }
}
