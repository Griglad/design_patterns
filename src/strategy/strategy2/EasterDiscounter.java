package strategy.strategy2;

import java.math.BigDecimal;

public class EasterDiscounter implements Discounter {
    @Override
    public BigDecimal applyDiscount(final BigDecimal amount) {
        System.out.println("Easter Discount");
        return amount.multiply(BigDecimal.valueOf(0.5));
    }


}
