package strategy.strategy2.next.version;

import java.math.BigDecimal;
import java.util.function.Consumer;

@FunctionalInterface
public interface Discounter {

     BigDecimal applyDiscount(double amount);

    static Discounter christmasDiscounter(double rate){
        return amount ->BigDecimal.valueOf(amount).multiply(BigDecimal.valueOf(rate));
    }

    static Discounter easterDiscounter(double rate){
        return amount -> BigDecimal.valueOf(amount).multiply(BigDecimal.valueOf(rate));
    }

    static Discounter newYearDiscounter(double rate){
        return amount ->BigDecimal.valueOf(amount).multiply(BigDecimal.valueOf(rate));
    }

    Consumer<BigDecimal> printFinalValue = (amount)-> System.out.println(amount);


}
