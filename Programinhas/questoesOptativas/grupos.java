package questoesOptativas;

import java.util.*;

public class grupos {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String> lista = new ArrayList<>();

        System.out.println("Insira o número de quantos nomes você quer inserir: ");
        int n = scan.nextInt();
        scan.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Insira o " + i + "º nome: ");
            String nome = scan.nextLine();
            lista.add(nome);
        }

        System.out.println("Insira quantos grupos você deseja: ");
        int ng = scan.nextInt();

        // Validação para garantir que há pessoas suficientes para os grupos
        while (ng > (n / 2)) {
            System.out.println("Há grupos demais para a quantidade de pessoas!");
            ng = scan.nextInt();
        }

        // Embaralha a lista para distribuir aleatoriamente
        Collections.shuffle(lista);

        // Calcula o tamanho básico de cada grupo e o resto
        int tamanhoGrupo = n / ng;
        int resto = n % ng;

        // Índice para percorrer `lista`
        int index = 0;

        // Criação dos grupos
        for (int i = 1; i <= ng; i++) {
            System.out.println("Grupo " + i + ":");

            // Define o número de membros para o grupo atual
            int membrosNoGrupo = tamanhoGrupo + (resto > 0 ? 1 : 0);
            if (resto > 0) resto--;

            // Adiciona membros ao grupo atual
            for (int j = 0; j < membrosNoGrupo; j++) {
                String nome = lista.get(index);
                System.out.println(" - " + nome);
                index++;
            }
        }

        scan.close();
    }
}
