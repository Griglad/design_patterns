package strategy.strategy2;

import java.math.BigDecimal;

public interface Discounter {
    // lets say that we want to apply 50% discount at Easter and 10% discount at Christmas.
    BigDecimal applyDiscount(BigDecimal amount);
}
