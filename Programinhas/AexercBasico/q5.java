package AexercBasico;

import java.util.Scanner;

public class q5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Dê o codigo 1 da peça: ");
        String codigo1 = scan.nextLine();

        System.out.print("De o numero 1 da peças: ");
        double n1 = scan.nextDouble();

        System.out.print("De o valor unitario da peça 1: ");
        double valor1 = scan.nextDouble();

        scan.nextLine();

        System.out.print("Dê o codigo 2 da peça: ");
        String codigo2 = scan.nextLine();

        System.out.print("De o numero 2 da peças: ");
        double n2 = scan.nextDouble();

        System.out.print("De o valor unitario da peça 2: ");
        double valor2 = scan.nextDouble();

        double valorFinal = (valor1 * n1) + (valor2 * n2);

        System.out.printf("VALOR A PAGAR: R$ %2.2f", valorFinal);

        scan.close();

    }
}

