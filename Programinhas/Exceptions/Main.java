package Exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = scan.nextInt();

        scan.nextLine();
        System.out.print("Holder: ");
        String holder = scan.nextLine();

        System.out.print("Initial balance: ");
        double balance = scan.nextDouble();

        System.out.print("Withdraw limit: ");
        double limit = scan.nextDouble();

        Account account = new Account(number, holder, balance, limit);

        System.out.print("Enter amount for withdraw:");
        double amount = scan.nextDouble();
        try {
            account.withdraw(amount);
        } catch (SaldoException e) {
            System.out.println("Withdraw erro: " + e.getMessage());
        }
        scan.close();
        System.out.println("New balance: " + balance);

    }
}
