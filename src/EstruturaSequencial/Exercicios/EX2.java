package EstruturaSequencial.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class EX2 {
    /*Faca um programa para ler o valor de raio de um circulo, e depois mostrar o valor da area deste circulo
    * com quatro casas decimais conforme exemplos*/

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double raio;

        System.out.printf("Digite o valor do raio: ");
        raio = scanner.nextDouble();

        double areaCirculo = Math.PI * (Math.pow(raio,2));
        System.out.printf("A=%.4f", areaCirculo);
        scanner.close();


    }
}
