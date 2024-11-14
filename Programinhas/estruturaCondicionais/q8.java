package estruturaCondicionais;

import java.util.Scanner;

public class q8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Insira seu salario: ");
        double salario = scan.nextDouble();
        double imposto = 0;

        if (salario >= 0 && salario <= 2000) {
            System.out.println("Isento.");
        } else if (salario >= 2000.01 && salario <= 3000) {
            imposto = 1000 * 0.08;
        } else if (salario > 3000 && salario <= 4500) {
            imposto = 1000 * 0.08 + ((salario - 3000) * 0.18);
        } else if (salario > 4500) {
            imposto = (1000 * 0.08) + ((1500) * 0.18) + ((salario - 4500) * 0.28);
        }

        System.out.printf("Seu imposto é: R$ %2.2f", imposto);

        scan.close();
    }
}
