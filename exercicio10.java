package Exerciciolista4;

import java.util.Scanner;

public class exercicio10 {
    public static int calculoDeDigitos(int numeros){
        int digitos = 1;
        while (numeros >= 10) {
            numeros /= 10;
            digitos++;
        }

        return digitos;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um número:");
        int numeros = teclado.nextInt();

        int resultado = calculoDeDigitos(numeros);

        System.out.println("Esse número possui: " + resultado + " digitos");
    }
}

