package exercicioFor;

import java.util.Scanner;

public class q6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um numero inteiro");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++){
            if(n%i==0)
                System.out.println(i);
        }

    }

}
