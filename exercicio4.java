package Exerciciolista4;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String[] nomes = new String[5];
        String Achei;
        System.out.println("informe os nomes");
        for (int i = 0; i < nomes.length; i++) {

            nomes[i] = teclado.nextLine();
        }
        System.out.println("informe os nomes");
        Achei = teclado.nextLine();
        boolean Achado = false;


        for (String nome : nomes) {

            if (Achei.equals(nome)) {
                Achado = true;

            }

            }
            if (Achado == true){
                System.out.println("Achei");
            }else {
                System.out.println("Não achei");
            }
           teclado.close(); }
        }


