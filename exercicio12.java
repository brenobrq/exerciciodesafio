package Exerciciolista4;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        {
            Scanner teclado = new Scanner(System.in);
            int numerop;
            int divisores = 0;

            System.out.print("Informe um número:");
            numerop = teclado.nextInt();

            for (int i = 1; i <= numerop; i++) {
                if (divisores % i == 0){
                    divisores++;
                }
            }

            if (divisores == 2){
                System.out.println("O número é primo");
            }else{
                System.out.println("O número não é primo");
            }

            teclado.close();
        }
    }
}
