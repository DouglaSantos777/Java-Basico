package estruturaRepeticao;

import java.util.Scanner;

public class whileExercicios {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();

        while(x != 0 ) {
        x = scan.nextInt();
        }

        scan.close();

    }
}
