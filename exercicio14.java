package Exerciciolista4;

import java.util.Scanner;

public class exercicio14 {
    static double base = 1;
    static double altura = 1;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a base do retângulo:");
        base = teclado.nextDouble();

        System.out.println("Digite a altura do retângulo:");
        altura = teclado.nextDouble();

        retangulo();
    }

    public static void retangulo(){

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("v");
            }
            System.out.println();
        }

    }

}

