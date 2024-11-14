package array;

import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Quanto numeros vc vai digitar: ");
        int n = scan.nextInt();

        int[] array = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i+1) + "º numero: ");
            System.out.println();
            array[i] = scan.nextInt();
        }

        scan.nextLine();

        System.out.println("Numeros Negativos:");
        for (int i = 0; i < n; i++) {
            if (array[i] < 0) {
                System.out.println(array[i]);
            }
        }


        scan.close();
    }
}
