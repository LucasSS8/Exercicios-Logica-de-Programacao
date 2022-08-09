package Exercicios;

import java.util.Scanner;

public class exercicio8 {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int totaleleitores;
        int brancos;
        int nulos;
        int validos;
        float percbrancos;
        float percnulos;
        float percvalidos;

        System.out.println("Digite a quantidade de eleitores do municipio : ");
        totaleleitores = s.nextInt();

        System.out.println("Digite a quantidade de votos brancos : ");
        brancos = s.nextInt();

        System.out.println("Digite a quantidade de votos nulos : ");
        nulos = s.nextInt();

        System.out.println("Digite a quantidade de votos validos : ");
        validos = s.nextInt();

        percbrancos = (100 * brancos)/totaleleitores;
        percnulos = (100 * nulos)/totaleleitores;
        percvalidos = (100 * validos)/totaleleitores;
        

        System.out.println("***********************************");
        System.out.println("Total de eleitores: " + totaleleitores);
        System.out.println("***********************************");
        System.out.println("Porcentage de votos brancos: "+percbrancos+"%");
        System.out.println("Porcentage de votos nulos: "+percnulos+"%");
        System.out.println("Porcentage de votos validos: "+percvalidos+"%");
      
    }
   
}
