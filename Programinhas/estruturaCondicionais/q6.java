package estruturaCondicionais;

import java.util.Scanner;

public class q6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Insira um numero entre 0 a 100: ");
        double n = scan.nextInt();

        if(n<0 || n>100){
            System.out.println("Fora do intervalo");
        } else if(n>=0 && n <=25) {
            System.out.print("Intervalo (0,25)");
        }  else if(n>25 && n <=50) {
        System.out.print("Intervalo (25,50)");
        }  else if(n>50 && n <=75) {
            System.out.print("Intervalo (50,75)");
        }  else if(n>75 && n <= 100) {
            System.out.print("Intervalo (75,100)");
    }

        scan.close();
    }
}
