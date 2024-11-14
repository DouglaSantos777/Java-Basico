package aleatorio;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String nome = "Lalo";
        int idade = 24;
        double renda = 5000;

        int l = 10;
        double j = 85.865555;

        System.out.println("mango joe");
        System.out.println(j);
        System.out.println(l);
        System.out.printf("%.2f%n", j);
        System.out.printf("%.4f%n", j);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", j);

        System.out.printf("Numeros são: %.2f metros%n", j);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reaix\n", nome, idade, renda);

        int c, d;
        int divisao;
        double divisao2;

        c = 3;
        d = 8;

        divisao = c / d;
        divisao2 = (double) c / d;

        System.out.println(divisao);
        System.out.println(divisao2);
        
        divisao2 = (float) c / d;
        System.out.println(divisao2);

;

    }
}
