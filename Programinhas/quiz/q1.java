package quiz;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class q1 {
    public static void main(String[] args) {
        // Lista de nomes (como exemplo)
        List<String> nomes = new ArrayList<>();
        nomes.add("Sofia Mendes");
        nomes.add("Lucas Silva");
        nomes.add("Maria Oliveira");
        nomes.add("Pedro Santos");
        nomes.add("Ana Martins");
        nomes.add("João Costa");
        nomes.add("Carolina Pereira");
        nomes.add("André Almeida");
        nomes.add("Mariana Fernandes");
        nomes.add("Tiago Rodrigues");

        // Quantidade de integrantes por grupo
        int tamanhoGrupo = 4;

        // Chama o método para sortear os grupos
        sortearGrupos(nomes, tamanhoGrupo);
    }

    public static void sortearGrupos(List<String> nomes, int tamanhoGrupo) {
        // Aleatoriza a lista de nomes
        Collections.shuffle(nomes);

        // Calcula o número total de grupos
        int numGrupos = (int) Math.ceil((double) nomes.size() / tamanhoGrupo);

        // Variáveis auxiliares para controle
        int index = 0;

        // Dividir os nomes em grupos
        for (int i = 0; i < numGrupos; i++) {
            List<String> grupo = new ArrayList<>();

            // Determina o tamanho do grupo (pode ser menor no último grupo)
            int tamanhoAtualGrupo = Math.min(tamanhoGrupo, nomes.size() - index);

            for (int j = 0; j < tamanhoAtualGrupo; j++) {
                grupo.add(nomes.get(index));
                index++;
            }

            // Exibe o grupo
            System.out.println("Grupo " + (i + 1) + ": " + grupo);
        }
    }
}

