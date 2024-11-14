package estruturaCondicionais;

import java.util.Scanner;

public class exerciciosIfelse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um valor A: ");
        int A = scan.nextInt();

        System.out.println("Insira um valor B: ");
        int B = scan.nextInt();

        /*
        if (A > B && A%B ==0) {
            System.out.println("São multiplos!");
        } else if (A > B && A%B !=0) {
            System.out.println("Não são mútiplos!");
        } else if (A < B && B%A ==0){
            System.out.println("São multiplos!");
        } else if (A < B && B%A !=0){
            System.out.println("São multiplos!");
        }

*/
        if (A % B == 0 || B % A == 0) {
            System.out.println("Sao Multiplos");
        }
        else {
            System.out.println("Nao sao Multiplos");
        }

        System.out.println("Obrigado!!!");


        scan.close();
    }

}
