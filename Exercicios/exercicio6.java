package Exercicios;

import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        double base;
        double altura;
        double area;

        System.out.println("Escreva o valor da base do retangulo");
        base = s.nextDouble();

        System.out.println("Escreva o valor da altura do retangulo");
        altura = s.nextDouble();

        area = base * altura;
        System.out.println("Área do retangulo de base :" + base + " e altura " + altura + " é : " + area);

    }
   
}
