package estruturaCondicionais;

import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Lance um numero:");
        int numero = scan.nextInt();

        if (numero > 0){
            System.out.println("Numero positivo");
        } else if (numero < 0){
            System.out.println("Numero negativo");
        }
        System.out.println("Obrigado por usar meu nobre.");

        scan.close();

    }
}
