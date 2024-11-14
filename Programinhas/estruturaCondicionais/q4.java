package estruturaCondicionais;

import java.util.Scanner;

public class q4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("DÊ UMA HORA INICIAL: ");
        double h1 = scan.nextDouble();
        System.out.println("DÊ UMA HORA final: ");
        double h2 = scan.nextDouble();

        double resultado = 0;

        if (h2 > h1) {
            resultado = h2 - h1;

        } else if (h1 > h2) {
            resultado = h2 + (24 - h1);
        }

        if (resultado < 1 || resultado > 24 ) {
            System.out.println("O jogo não pode ter menos de 1 hora ou mais que 24.");
        } else {
            System.out.printf("O JOGO DUROU %2.2f HORA(S).", resultado);
        }

        scan.close();
    }
}
