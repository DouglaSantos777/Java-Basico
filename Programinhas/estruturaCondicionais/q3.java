package estruturaCondicionais;

import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Dale 2 numeros:");
        int A = scan.nextInt();
        int B = scan.nextInt();

        if(A % B == 0 || B % A == 0 ) {
            System.out.println("Sao multiplos.");
        } else {
            System.out.println("Não sao multiplos.");
            System.out.println("Não sao multiplos.");
        }


    scan.close();
    }

}
