package poo.q2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o nome");
        String name = scan.nextLine();
        System.out.println("Insira o salario bruto");
        double grossSalary = scan.nextDouble();
        System.out.println("Insira o imposto");
        double imposto = scan.nextDouble();

        Funcionario funcionario = new Funcionario(name, grossSalary, imposto);

        System.out.println(funcionario.toString());

        System.out.println("Qual porcentagem quer aumentar o salario?");
        double percentage = scan.nextDouble();

        funcionario.IncreaseSalary(percentage);

        System.out.println(funcionario.toString());
    }

}
