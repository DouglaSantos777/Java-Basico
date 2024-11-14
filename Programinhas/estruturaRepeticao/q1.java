package estruturaRepeticao;

import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira uma senha: ");
        String codigo = scan.nextLine();

        while(!(codigo.equals("2002"))){
            System.out.println("Senha Inválida, insira de novo por favor.");
            codigo = scan.nextLine();
        }

        System.out.println("Acesso permitido.");

        scan.close();
    }
}
