package Exercicios;

import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int a;
        int ant;

        System.out.println("Escreva um numero inteiro");
        a = s.nextInt();
        ant = a - 1;
        System.out.println("Antecessor de "+ a +" é "+ant);

    }
   
}
