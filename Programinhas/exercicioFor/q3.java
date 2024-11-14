package exercicioFor;

import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um valor inteiro N:");
        int n = scan.nextInt();

        for (int i =1; i<n; i++){
            System.out.print("Insira o 1º valor:");
            double v1 = scan.nextDouble();
            System.out.print("Insira o 2º valor:");
            double v2 = scan.nextDouble();
            System.out.print("Insira o 3º valor:");
            double v3 = scan.nextDouble();

            double media = ((v1 * 2) + (v2 * 3) + (v3 * 5))/10;
            System.out.printf("%2.1f%n",media);
        }




    }

}
