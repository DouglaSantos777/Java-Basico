package aleatorio;

import java.util.Locale;
import java.util.Scanner;

public class exercicio {

    public static void main(String[] args) {

   Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

     /*  double pi = 3.14159;

        System.out.println("Me diga o raio:");
        double r = scan.nextDouble();

        double r2 = Math.pow(r, 2);

        double resultado = pi * r2;

        System.out.printf("A area do circulo é: %2.4f%n", resultado);

       System.out.println("Me de um numero A: ");
        int a = scan.nextInt();

        System.out.println("Me de um numero B:");
        int b = scan.nextInt();

        System.out.println("O resultado é : " + (a + b) + ", obrigado por usar meu programa." );
   */ 

       double pi = 3.14159;

        System.out.println("Me de um lado A:");
        double A = scan.nextDouble();

        System.out.println("Me de um lado B:");
        double B = scan.nextDouble();

        System.out.println("Me de um lado C:");
        double C = scan.nextDouble();

        double triangulo = A * C / 2;

        double areaCirculo = pi * Math.pow(C, 2);

        double trapezio = (A + B) * C /2 ;
        
        double quadrado = Math.pow(B, 2);

        double retangulo = A * B;

        System.out.printf(" Área do triângulo retângulo:: %2.2f%n", triangulo );
        System.out.printf(" Área do circulo: %2.2f%n", areaCirculo );
        System.out.printf(" Área do trapezio: %2.2f%n", trapezio );
        System.out.printf(" Área do quadrado: %2.2f%n", quadrado );
        System.out.printf(" Área do retangulo: %2.2f%n", retangulo );

        scan.close();
        
    }
}
