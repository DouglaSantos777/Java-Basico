package array.pensionato;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("HOW MANY ROOMS WILL BE RENTED?");
        int n = scan.nextInt();

        for(int i=0; i<n;i++){
            System.out.println("Rent #" +(i));
            System.out.print("Name: ");
            String nome = scan.nextLine();
            System.out.println();
        }


    }
}
