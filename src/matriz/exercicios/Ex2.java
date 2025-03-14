package matriz.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho da matrix NxN: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matriz = new int[m][n];

        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j <matriz[i].length ; j++) {
                int valor = sc.nextInt();
                matriz[i][j] = valor;
            }
        }

        int buscado = sc.nextInt();

        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j <matriz[i].length ; j++) {
                if (matriz[i][j] == buscado){
                    System.out.printf("Position: %d, %d", i, j);

                    if (j > 0){
                        System.out.println("\nLeft: " + matriz[i][j-1]);
                    }

                    if (j < matriz[j].length-1){
                        System.out.println("Rigth: " + matriz[i][j+1]);
                    }

                    if (i > 0){
                        System.out.println("UP: " + matriz[i-1][j]);
                    }

                    if (i < matriz.length-1){
                        System.out.println("Down: " + matriz[i+1][j]);
                    }
                }
            }
        }

    }
}
