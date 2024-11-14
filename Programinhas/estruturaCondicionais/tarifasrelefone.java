package estruturaCondicionais;

import java.util.Scanner;

public class tarifasrelefone {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos minutos consumiu?");
        int m = scan.nextInt();

        double conta = 50;


        if (m >= 100) {
            conta += (m - 100) * 2;
        }
        System.out.printf("Voce deve pagar %.2f%n", conta);


        scan.close();
    }
}
