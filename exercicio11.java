package Exerciciolista4;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args){
        String palavra = "Arara";
        String invertida = "";

        for (int i = (palavra.length() - 1); i >= 0; i--) {
            invertida += palavra.charAt(i);
        }
        if (invertida.toLowerCase().equals(palavra.toLowerCase())){
            System.out.println("É um palidromo");
        } else {
            System.out.println("Não é um palidromo");
        }
    }
}






