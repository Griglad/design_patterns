package strategy.strategy2;

import java.math.BigDecimal;

public class ChristmasDiscounter implements Discounter {
    @Override
    public BigDecimal applyDiscount(BigDecimal amount) {
        System.out.println("Christmas Discount");
        return amount.multiply(BigDecimal.valueOf(0.9));

    }


}
