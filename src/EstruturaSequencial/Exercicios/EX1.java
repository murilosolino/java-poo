package EstruturaSequencial.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        // Faca um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses numeros com
        // uma mensagem explicativa.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b;
        System.out.printf("Digite o primeiro numero: ");
        a = sc.nextDouble();

        System.out.printf("Digite o segundo numero: ");
        b = sc.nextDouble();

        double resultado = a + b;
        System.out.println("SOMA = " + resultado);
        sc.close();
    }
}
