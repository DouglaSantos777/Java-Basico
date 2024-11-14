package poo.q3;

import java.util.Scanner;

public class Aluno {
    private String nome;
    private double nota;
    private int trimestre;
    private boolean aprovado;

    public Aluno(){

    }

    public Aluno(String nome, double nota, int trimestre, boolean aprovado) {
        this.nome = nome;
        this.nota = nota;
        this.trimestre = trimestre;
        this.aprovado = aprovado;
    }

    public void CalcularNota(){
        Scanner scan = new Scanner(System.in);
        double soma = 0;
        System.out.print("Insira a nota do 1 semestre: ");
        nota = scan.nextDouble();
        while(nota< 0 || nota>30){
            System.out.print("insira uma nota de 0 a 30: ");
            nota = scan.nextDouble();
        }
        soma += nota;
        for (int i =1; i <=2; i++) {
            System.out.print("Insira nota do " + (i+1) + "º trimeste: ");
            nota = scan.nextDouble();
            while(nota< 0 || nota>35){
                System.out.println("insira nota de 0 a 35");
                nota = scan.nextDouble();

            }
            soma+=nota;
        }
        double media = soma;

        double mediaMin = 60.00;
        double missingP = mediaMin - media;

        if (media<mediaMin){
            System.out.println("FAILED");
            System.out.printf("MISSIN %2.2f POINTS", missingP);
        } else {
            System.out.printf("FINAL GRADE =  %2.2f%n", media);
            System.out.println("PASS");
        }
        scan.close();
    }

}

