package STATIC;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double price = scan.nextDouble();

        scan.nextLine();

        System.out.print("How many dollars will be bought? ");
        double dollars = scan.nextDouble();

        double amount = CurrencyConverter.CalculateDolar(price, dollars);

        System.out.printf("Amount to be paid in reais = %2.2f", amount);

        scan.close();
    }
}
