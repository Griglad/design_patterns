package strategy.strategy2;

import java.math.BigDecimal;

public class App {

    public static void main(String ... args){

        Discounter christmasDiscounter = new EasterDiscounter();
        Discount discount = new Discount(christmasDiscounter);
        discount.applyDiscount(BigDecimal.valueOf(100));



    }
}
