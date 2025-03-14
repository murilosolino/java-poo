package introducaoPOO.exercicios.vetores.ex1;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] vect = new int[n];
        int somaPares = 0;
        int conategemPares =0;
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("\nDigite um numero: ");
            vect[i] = sc.nextInt();
            if (vect[i] % 2 == 0){
                conategemPares++;
                somaPares += vect[i];
            }
        }


        if (conategemPares != 0){
            double media = somaPares / conategemPares;
            System.out.println("MEDIA DOS PARES = " + media);
        } else {
            System.out.println("NENHUM NUMERO PAR");
        }
        sc.close();
    }
}
