package array;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Quanto numeros vc vai digitar: ");
        int n = scan.nextInt();
        scan.nextLine();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] altura = new double[n];


        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i+1) + "º pessoa:");
            System.out.println("Digite o " + (i + 1) + "º nome: ");
            nomes[i] = scan.nextLine();
            System.out.println("Digite a idade de " + nomes[i] + ": ");
            idades[i] = scan.nextInt();
            System.out.println("Digite a altura de " + nomes[i] + ": ");
            altura[i] = scan.nextDouble();
            scan.nextLine();
        }

        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma += altura[i];
        }
        double mediaH = soma / n;

        System.out.printf("Altura Média: %2.2f%n", mediaH);

        int menores = 0;
        for (int i = 0; i < n; i++) {
            if(idades[i]<16){
                menores++;
            }
        }

        double menoresPorcen = ((double) menores / n) * 100; //convertendo menores pra double pq estava int

        System.out.printf("Menores de 16: %.1f%%%n" , menoresPorcen);

        for (int i = 0; i < n; i++) {
            if(idades[i]<16){
                System.out.println(nomes[i]);
            }
        }

        scan.close();
    }
}

