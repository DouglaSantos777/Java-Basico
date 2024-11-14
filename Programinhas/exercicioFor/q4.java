package exercicioFor;

import java.util.Scanner;

public class q4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um numero N:");
        int n = scan.nextInt();

        for (int i =1; i<=n;i++){
            System.out.println("Insira um numero:");
            double n1 = scan.nextDouble();
            System.out.println("Insira outro numero:");
            double n2 = scan.nextDouble();

            if(n2 ==0){
                System.out.println("Divisão impossível.");
             } else {
                System.out.println(n1/n2);
            }


        }

    }

}
