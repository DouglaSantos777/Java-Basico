package exercicioFor;

import java.util.Scanner;

public class q2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira um valor: ");
        int n = scan.nextInt();

        int in = 0;
        int out = 0;

        int x;

        for (int i = 1; i <= n; i++) {
            System.out.println("Insira numero: ");
            x = scan.nextInt();
            if (x >= 10 && x <= 20) {
                in ++;
            } else {
                out ++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
