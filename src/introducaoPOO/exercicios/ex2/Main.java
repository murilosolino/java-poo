package introducaoPOO.exercicios.ex2;

import introducaoPOO.exercicios.ex1.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();


        System.out.println(funcionario.toString());

        System.out.println("Funcionario " + funcionario.name + ", $ " + funcionario.salarioLiquido());

        System.out.println("Qual a porcentagem de incremento de salario? ");
        double porcentagem = sc.nextDouble();
        funcionario.incrementaSalario(porcentagem);

        System.out.println("Dados Atualizados " + funcionario.name + ", $ " + funcionario.salarioLiquido());
        sc.close();
    }
}
