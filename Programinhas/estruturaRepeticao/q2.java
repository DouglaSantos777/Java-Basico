package estruturaRepeticao;

import java.util.Scanner;

public class q2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();

/*
        int x = 0;
        int y = 0;

        do {
            System.out.println("Insira coordenada x:");
            x = scan.nextInt();

            System.out.println("Insira coordenada y:");
            y = scan.nextInt();

            if(x>0 && y>0){
                System.out.println("primeiro");
            } else if(x<0 && y>0){
                System.out.println("segundo");
            } else if(x<0 && y<0){
                System.out.println("terceiro");
            } else if(x>0 && y<0) {
                System.out.println("quarto");
            }
        }while(x != 0 && y != 0);
        */

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            }
            else if (x < 0 && y > 0) {
                System.out.println("segundo");
            }
            else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            }
            else {
                System.out.println("quarto");
            }
            x = scan.nextInt();
            y = scan.nextInt();
        }


    }

}
