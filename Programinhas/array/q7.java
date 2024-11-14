package array;

import java.util.Locale;
import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        System.out.print("Quanto elementos vai ter o vetor? ");
        int n = scan.nextInt();

        double[] numeros = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o " + (i + 1) + "º numero: ");
            numeros[i] = scan.nextDouble();
        }

        double soma = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 == 0) {
                soma += numeros[i];
                count++;
            }
        }

        double media = soma / count;
        if (count == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            System.out.printf("MEDIA DOS PARES = %.1f", media);
        }
        System.out.println();

        scan.close();
    }
}
