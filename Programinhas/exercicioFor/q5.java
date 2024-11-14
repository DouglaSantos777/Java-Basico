package exercicioFor;

import java.util.Scanner;

public class q5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um numero");
        int n = scan.nextInt();

        int fatorial = 1;

        if (n == 0) {
            System.out.println(1);
        } else {
            for (int i = 1; i <= n; i++) {

                fatorial *= i;

            }
            System.out.println(fatorial);
        }

    }

}
