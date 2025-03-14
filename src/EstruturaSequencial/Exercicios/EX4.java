package EstruturaSequencial.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class EX4 {
    /*Fazer um programa que leia o numero de um funcionario, seu numero de horas trabalhadas, o valor que recebe por hora e calcula o salario desse
    * funcionario. A seguir, mostre o numero e o salario do funcionario, com duas casas decimais.*/
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int numero;
        double horasTrabalhadas;
        double valorHora;
        double salario;

        System.out.printf("Digite o numero do funcionario: ");
        numero = scanner.nextInt();

        System.out.printf("Digite a quantidade de horas trabalhadas: ");
        horasTrabalhadas = scanner.nextDouble();

        System.out.printf("Digite o valor da hora: ");
        valorHora = scanner.nextDouble();

        salario = valorHora * horasTrabalhadas;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$%.2f", salario);

        scanner.close();

    }
}
