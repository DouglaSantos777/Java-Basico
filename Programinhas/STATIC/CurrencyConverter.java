package STATIC;

public class CurrencyConverter {
    private static final double IOF = 0.06;

    public CurrencyConverter(){

    }

    public static double CalculateDolar(double price, double dollars){
        double amount = (price * dollars);
        return (amount + (amount * IOF));
    }
}
