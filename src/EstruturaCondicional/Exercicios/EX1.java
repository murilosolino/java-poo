package EstruturaCondicional.Exercicios;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        numero = scanner.nextInt();

        if (numero >= 0){
            System.out.println("Nao negativo");
        } else {
            System.out.println("Negativo");
        }
     scanner.close();
    }
}
