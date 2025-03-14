package EstruturaCondicional.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double numero;

        numero = scanner.nextDouble();

        if (numero >= 0 && numero <= 25){
            System.out.println("INTERVALO [0,25]");
        } else if (numero > 25 && numero <= 50) {
            System.out.println("INTERVALO [25, 50]");
        } else if (numero > 50 && numero <= 75) {
            System.out.println("INTERVALO [50, 75]");
        }else if (numero >75 && numero <=100){
            System.out.println("INTERVALO [75, 100]");
        } else {
            System.out.println("FORA DO INTERVALO");
        }

        scanner.close();
    }
}
