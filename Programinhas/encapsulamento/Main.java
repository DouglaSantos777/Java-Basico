package encapsulamento;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int number = scan.nextInt();

        System.out.print("Enter account holder: ");
        scan.nextLine();
        String holder = scan.nextLine();
        System.out.println("Is there an initial deposit (y/n)?");
        char answer = scan.next().charAt(0);

        if (answer == 'y') {
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = scan.nextDouble();
            account = new Account(number, holder, initialDeposit);
        } else {
            account = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account.toString());

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = scan.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account");
        System.out.println(account); //

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double withDrawValue = scan.nextDouble();
        account.withDraw(withDrawValue);
        System.out.println("Updated account");
        System.out.println(account); // ja imprime o toString automaticamente mesmo sme chamar
// ja imprime o toString automaticamente mesmo sme chamar

        scan.close();

    }

}
