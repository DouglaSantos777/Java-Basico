package array;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Quanto numeros vc vai digitar: ");
        int n = scan.nextInt();

        double[] numeros = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o " + (i + 1) + "º numero: ");
            numeros[i] = scan.nextInt();
        }

        double vmaior = 0 ;
        for (int i = 0; i < n; i++) {
            if(numeros[i] > vmaior){
                vmaior = numeros[i];
            }
        }

        System.out.print("MAIOR VALOR = ");
        System.out.printf("%.1f%n",vmaior);

        System.out.print("POSICAO DO MAIOR VALOR = ");

        for(int i =0; i <n; i++){
            if(numeros[i] == vmaior)
                System.out.print(i);
        }

    }

}
