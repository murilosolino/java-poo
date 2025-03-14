package introducaoPOO.exercicios.ex5Banco;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ContaBancaria contaBancaria;

        System.out.printf("Entre com o numero da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.printf("\nEntre com o nome do titular: ");
        String titular = sc.nextLine();
        System.out.printf("Deseja iniciar com um deposito (s/n)? ");
        String inciaDeposito = sc.nextLine();

        if (inciaDeposito.equalsIgnoreCase("s")){
            System.out.printf("\nEntre com o valor que deseja depositar");
            double deposito = sc.nextDouble();
            contaBancaria = new ContaBancaria(numeroConta, titular, deposito);
        } else {
            contaBancaria = new ContaBancaria(numeroConta, titular);
        }

        System.out.println("\n" +contaBancaria.toString());

        System.out.printf("\nEntre com um valor para deposito: ");
        double valor = sc.nextDouble();
        contaBancaria.deposito(valor);

        System.out.printf("\nConta Atualizada: " + contaBancaria.toString());

        System.out.printf("\nEntre com um valor para saque: ");
        valor = sc.nextDouble();
        contaBancaria.saque(valor);

        System.out.printf("\nConta Atualizada: " + contaBancaria.toString());


        sc.close();
    }
}
