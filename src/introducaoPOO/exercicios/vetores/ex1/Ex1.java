package introducaoPOO.exercicios.vetores.ex1;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("\nDigite um numero: ");
            vect[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Numeros Negativos");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }
        sc.close();
    }

}
