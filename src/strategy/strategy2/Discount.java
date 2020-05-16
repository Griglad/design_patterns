package strategy.strategy2;

import java.math.BigDecimal;

public class Discount {
    private Discounter discounter;

    public Discount(Discounter discounter){
        this.discounter = discounter;

    }

    public void applyDiscount(BigDecimal amount){

        System.out.println(discounter.applyDiscount(amount) + " final amount");
    }



}
