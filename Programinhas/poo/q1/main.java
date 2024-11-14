package poo.q1;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a largura do rentangulo: ");
        double width = scan.nextDouble();
        System.out.println("Insira a altura do rentangulo: ");
        double height = scan.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);

        System.out.println(rectangle.Area());
        System.out.println(rectangle.Perimeter());
        System.out.println(rectangle.Diagonal());


    }

}
