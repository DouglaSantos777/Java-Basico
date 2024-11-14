package estruturaCondicionais;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<fastFood> fasts = new ArrayList<>();

        fasts.add(new fastFood(1, "Cachorro Quente", 4.00));
        fasts.add(new fastFood(2, "X-Salada", 4.50));
        fasts.add(new fastFood(3, "X-Bacon", 5.00));
        fasts.add(new fastFood(4, "Torrada simples", 2.00));
        fasts.add(new fastFood(5, "Refrigerante", 1.50));

        double valor = 0;

        int codigo;

        System.out.println("Bem-Vindo, estas são nossos FastFoods disponíveis:");
        System.out.println(fasts.get(0).toString());
        System.out.println(fasts.get(1).toString());
        System.out.println(fasts.get(2).toString());
        System.out.println(fasts.get(3).toString());
        System.out.println(fasts.get(4).toString());

        System.out.print("Insira um codigo de 1 a 5: ");
        codigo = scan.nextInt();

        while (codigo < 1 || codigo > 5) {
            System.out.print("Insira um codigo de 1 a 5, por favor: ");
            codigo = scan.nextInt();
        }

        switch (codigo) {
            case 1:
                valor = fasts.get(0).valor;
                break;
            case 2:
                valor = fasts.get(1).valor;
                break;
            case 3:
                valor = fasts.get(2).valor;
                break;
            case 4:
                valor = fasts.get(3).valor;
                break;
            case 5:
                valor = fasts.get(4).valor;
                break;
        }

        System.out.println("Insira a quantidade que desejas: ");
        int q = scan.nextInt();

        double preco = valor * q;

        System.out.printf("Deu %2.2f R$.", preco);

        scan.close();
    }

    public static class fastFood {
        private String nome;
        private int codigo;
        private double valor;

        public fastFood(int codigo, String nome, double valor) {
            this.codigo = codigo;
            this.nome = nome;
            this.valor = valor;
        }

        @Override
        public String toString() {
            return "fastFood: "
                    + nome + '\'' +
                    ", codigo=" + codigo +
                    ", valor=" + valor + " R$."
                    ;
        }
    }

}
