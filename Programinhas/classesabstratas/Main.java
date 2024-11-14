package classesabstratas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = scan.nextInt();
        List<TaxPayer> persons = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.print("Tax payer #" + i + " data: ");
            System.out.println();
            System.out.print("Individual or company (i/c)? ");
            char r = scan.next().charAt(0);
            scan.nextLine();
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Anual income: ");
            double income = scan.nextDouble();

            if (r == 'i') {
                System.out.print("Health expenditures: ");
                double health = scan.nextDouble();
                persons.add(new Individual(name, income, health));

            } else if (r == 'c') {
                System.out.print("Number of employees: ");
                int emp = scan.nextInt();
                persons.add(new Company(name, income, emp));
            }
        }

        System.out.println("TAXES PAID:");
        double sum = 0;
        for(TaxPayer p: persons) {
            System.out.printf( p.getName() + ": $ %.2f", p.calculateTax());
            System.out.println();
         sum += p.calculateTax();
        }

        System.out.println();

        System.out.printf("TOTAL TAXES: $ %.2f", sum);
    }
}
