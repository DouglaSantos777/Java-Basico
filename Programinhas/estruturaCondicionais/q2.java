package estruturaCondicionais;

import java.util.Scanner;

public class q2 {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

        System.out.println("Dale um numero: ");
        int numero = scan.nextInt();

        if(numero%2 != 0){
            System.out.println("Numero ímpar");
        } else  if(numero%2 == 0){
            System.out.println("O numero é par");
        } else {
            System.out.println("O numero é 0.");
        }

    scan.close();
    }
}
