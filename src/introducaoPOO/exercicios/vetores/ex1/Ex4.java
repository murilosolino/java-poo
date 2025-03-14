package introducaoPOO.exercicios.vetores.ex1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("\nDigite um numero: ");
            vect[i] = sc.nextInt();
        }

        int pares =0;
        System.out.println("NUMEROS PARES:");
        for (int i = 0; i < vect.length ; i++) {
            if (vect[i] % 2 == 0){
                pares++;
                System.out.printf("%d ", vect[i]);
            }
        }
        System.out.println();
        System.out.println("QUANTIDADE DE PARES: " + pares);
        sc.close();
    }
}
