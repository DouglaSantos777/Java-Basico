package array;

import java.util.Locale;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Quanto numeros vc vai digitar: ");
        int n = scan.nextInt();
        scan.nextLine();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o " + (i + 1) + "º numero: ");
            numeros[i] = scan.nextInt();
        }
        scan.nextLine();

        System.out.println("NUMEROS PARES: ");
        for (int i = 0; i < n; i++) {
            if(numeros[i]%2==0){
                System.out.print(numeros[i] + " ");
            }
        }
        System.out.println();

        System.out.print("QUANTIDADE DE PARES = ");
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(numeros[i]%2==0){
                count+=1;
            }
        }
        System.out.println(count);

        scan.close();

    }

}
