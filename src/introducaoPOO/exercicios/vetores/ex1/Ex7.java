package introducaoPOO.exercicios.vetores.ex1;

import java.util.Locale;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.printf("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double soma = 0;
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("\nDigite um numero: ");
            vect[i] = sc.nextDouble();
            soma+=vect[i];
        }

        double media = soma / vect.length;
        System.out.printf("MEDIA DO VETOR = %.3f \n ", media);

        for (int i = 0; i < vect.length ; i++) {
            if (vect[i] < media){
                System.out.println(vect[i]);
            }
        }
        sc.close();
    }
}
