package estruturaRepeticao;

import java.util.Scanner;

public class forExercicio {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        int n = scan.nextInt();
        int soma = 0;
       /* for(int i = 0; i<n; i++){
            int x = scan.nextInt();
            soma += x;
            System.out.println(soma);
        }
*/

        for(int i = 5 ; i>0; i--){
            System.out.println(i);
        }

    }
}
