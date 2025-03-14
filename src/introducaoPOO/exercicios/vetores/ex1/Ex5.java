package introducaoPOO.exercicios.vetores.ex1;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("\nDigite um numero: ");
            vect[i] = sc.nextDouble();
        }

        double maior =0;
        int posicaoMaior = 0;
        for (int i = 0; i < vect.length ; i++) {
            double aux = vect[i];
            if (aux > maior){
                maior = aux;
                posicaoMaior = i;
            }
        }

        System.out.println("MAIOR VALOR = " + maior);
        System.out.println("POSICAO DO MAIOR VALOR: " + posicaoMaior);
        sc.close();
    }
}
