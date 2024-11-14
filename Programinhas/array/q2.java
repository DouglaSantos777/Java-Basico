package array;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Quanto numeros vc vai digitar: ");
        int n = scan.nextInt();

        int[] array = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i + 1) + "º numero: ");
            System.out.println();
            array[i] = scan.nextInt();
        }

        scan.nextLine();

        System.out.print("Valores = ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        int soma = 0;
        for (int i = 0; i < n; i++) {
            soma += array[i];
        }
        System.out.print("SOMA = " + soma);

        int media = soma /n;
        System.out.println();
        System.out.print("MEDIA = " + media);

        scan.close();
    }
}
