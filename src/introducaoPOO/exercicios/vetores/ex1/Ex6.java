package introducaoPOO.exercicios.vetores.ex1;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Quantos numeros voce vai digitar em cada vetor? ");
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];

        System.out.println("Digite os valores do vetor A");
        for (int i = 0; i < A.length; i++) {
            System.out.printf("\nDigite um numero: ");
            A[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B");
        for (int i = 0; i < B.length; i++) {
            System.out.printf("\nDigite um numero: ");
            B[i] = sc.nextInt();
        }

        int[] C = new int[n];

        for (int i = 0; i <C.length ; i++) {
           C[i] = A[i] + B[i];
           System.out.println(C[i]);
        }
        sc.close();
    }
}
