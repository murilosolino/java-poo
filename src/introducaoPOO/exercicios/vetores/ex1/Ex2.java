package introducaoPOO.exercicios.vetores.ex1;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        double soma =0;
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("\nDigite um numero: ");
            vect[i] = sc.nextDouble();
            soma+=vect[i];
        }

        System.out.printf("Valores = ");
        for (int i = 0; i < vect.length ; i++) {
            System.out.printf("%.2f ", vect[i]);;
        }

        System.out.println();
        double media = soma / vect.length;
        System.out.println("SOMA= " + soma);
        System.out.println("MEDIA= " + media);

        sc.close();
    }

}
