package Exerciciolista4;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vetor = new int[10];

        int numero;
        int maior = 0;

        for (int i = 0; i < vetor.length ;) {

            System.out.println("informe um  valor com os requisitos de pares:");

            numero = teclado.nextInt();
            if ((numero % 2) == 0){
                vetor[i] = numero;
                System.out.println("valor valido");
                i++;
            } else{
                System.out.println("valor invalido:");

            }


        }
        for (int i = 0; i < 10; i++) {
            if (vetor[i] < maior){
                maior = vetor[i];

                System.out.println("esse é o maior valor: " + maior + " essa é sua posição " + vetor);
            }
        }


                teclado.close();
        }
    }

