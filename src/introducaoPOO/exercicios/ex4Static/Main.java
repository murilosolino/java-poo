package introducaoPOO.exercicios.ex4Static;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a cotacao do dolar");
        double precoDolar = sc.nextDouble();
        System.out.println("Deseja comprar quantos dolares?");
        double qtdComprarDolar = sc.nextDouble();

        System.out.println("Total a ser pago em reais: " + CurrencyConverter.valorTotalAPagar(precoDolar, qtdComprarDolar));

        sc.close();
    }
}
