package strategy.strategy2.next.version;


import java.math.BigDecimal;
import java.util.*;

public class App {
    static Scanner input = new Scanner(System.in);

    public static void main(String... args) {
        System.out.println("Enter the cost");
        double cost = input.nextDouble();

        Map<String, Discounter> discounters = new HashMap<>();

        discounters.put("Christmas Discount", Discounter.christmasDiscounter(0.1));
        discounters.put("Easter Discount", Discounter.easterDiscounter(0.2));
        discounters.put("NewYear Discount", Discounter.newYearDiscounter(0.3));

        System.out.println("--------------");
        discounters.entrySet().stream().map(e -> {
            System.out.print(e.getKey() + " ");
            return e.getValue().applyDiscount(cost);
        }).forEach(Discounter.printFinalValue);
        System.out.println("--------------");

        System.out.println("----------Printing Final paid amount-------------");
        String discountString = discounters.entrySet().stream().map(e -> e.getValue().applyDiscount(cost))
                .reduce(BigDecimal.ZERO, BigDecimal::add).toString();

        double discount = Double.valueOf(discountString);


        if (cost > discount) {
            System.out.println("final paid amount is " + (cost - discount));
        } else {
            System.err.println("Discount cant be achieved");
        }


    }
}
