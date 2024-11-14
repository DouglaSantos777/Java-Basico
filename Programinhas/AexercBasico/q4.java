package AexercBasico;

import java.util.Scanner;

public class q4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("De o numero do funcionário");
        int n = scan.nextInt();

        System.out.println("Horas trabalhadas?");
        double horas = scan.nextDouble();

        System.out.println("Valor recebido por hora:");
        double valor = scan.nextDouble();

        double salario = horas * valor;

        System.out.printf("O funcionário Nº: " + n + ", recebe %2.2f R$ por mês.", salario);

        scan.close();

    }

}
