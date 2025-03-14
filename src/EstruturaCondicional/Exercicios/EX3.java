package EstruturaCondicional.Exercicios;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2;

        numero1 = scanner.nextInt();
        numero2 = scanner.nextInt();

        if (numero1 >= numero2){
            if (numero1 % numero2 == 0){
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao sao multiplos");
            }
        }  else {
            if (numero2 % numero1 == 0){
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao sao multiplos");
            }
        }
        scanner.close();
    }
}
