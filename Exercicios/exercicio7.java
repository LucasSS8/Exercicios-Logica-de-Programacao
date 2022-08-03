package Exercicios;

import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int anos;
        int meses;
        int dias;
        float diastotal;

        System.out.println("Digite quantos anos de idade você tem : ");
        anos = s.nextInt();

        System.out.println("Digite quantos meses de idade você tem : ");
        meses = s.nextInt();

        System.out.println("Digite quantos dias de idade você tem : ");
        dias = s.nextInt();

        diastotal = ((anos*365) + (meses*30) + dias); 

        System.out.println("Você tem "+ diastotal +" dias de idade");



      
    }
   
}
