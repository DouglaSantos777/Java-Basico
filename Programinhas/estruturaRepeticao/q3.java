package estruturaRepeticao;

import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha seu combustível:\n" +
                "1-Alcool.\n" +
                "2-Gasolina.\n" +
                "3-Diesel.\n" +
                "4-Fim.\n"
        );

        int n = scan.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (n!=4) {
            if (n == 1) {
                alcool += 1;
            } else if (n == 2) {
                gasolina += 1;
            } else if (n == 3) {
                diesel += 1;
            }


            n = scan.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("1-Alcool:" + alcool + "\n" +
                "2-Gasoline:" + gasolina + "\n" +
                "3-Diesel:" + diesel);

    }
}
