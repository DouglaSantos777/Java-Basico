package estruturaCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class q7 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um numero x com casa decimal");
        double x = scan.nextDouble();
        System.out.println("Insira um numero y com casa decimal");
        double y = scan.nextDouble();

        if(x>0 && y>0){
            System.out.println("Q1");
        } else if(x<0 && y>0){
            System.out.println("Q2");
        } else if(x<0 && y<0){
            System.out.println("Q3");
        } else if(x>0 && y<0){
            System.out.println("Q4");
        } else {
            System.out.println("Origem");
        }



        scan.close();
    }

}
