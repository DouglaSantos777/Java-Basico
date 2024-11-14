package exercicioFor;

import java.util.Scanner;

public class q7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um numero inteiro:");
        int n = scan.nextInt();

        for (int i = 1; i <=n; i++){
            System.out.print(i + " ");
            System.out.printf("%2.0f ",Math.pow(i,2));
            System.out.printf("%2.0f%n",Math.pow(i,3));;
        }

    }

}
