package AexercBasico;

import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Diga quatro numero pfv(um por vez meu nobre: )");
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();

        double diferenca = A * B - C * D;

        System.out.printf("O resultado de (A * B - C * D é %2.2f", diferenca);


    }
}
