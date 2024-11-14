package exercicioFor;

import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um numero inteiro de 1 a 1000.");
        int X = scan.nextInt();

        while(X < 1 || X > 1000){
            System.out.println("Numero de 1 a 100 pfv.");
            X = scan.nextInt();
        }


        for (int i=1; i <= X; i++){
            if(i%2!=0)
            System.out.println(i);

        }

    }

}
