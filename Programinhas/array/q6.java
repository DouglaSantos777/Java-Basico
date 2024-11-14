package array;

import java.util.Locale;
import java.util.Scanner;

public class q6 {
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

        double soma = 0 ;
        for (int i = 0; i < n; i++) {
               soma += numeros[i];
        }
        double media = soma/n;

        System.out.printf("MEDIA DO VERTOR = %.3f%n", media);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (int i = 0; i < n; i++) {
            if(numeros[i] < media)
                System.out.println(numeros[i]);
        }


        scan.close();
    }
}
