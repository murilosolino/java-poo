package matriz.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho da matrix NxN: ");
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        for (int linha = 0; linha < matriz.length ; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                int valor = sc.nextInt();
                matriz[linha][coluna] = valor;
            }
        }

        System.out.println("Diagonal Principal");
        for (int i = 0; i < n ; i++) {
            System.out.println(matriz[i][i]);
        }

        System.out.println("Numeros negativos");
        int negativos = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0){
                    negativos++;
                }
            }
        }
        System.out.println(negativos);


        sc.close();
    }
}
