package listas.exercicio.app;

import listas.exercicio.entidade.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Funcionario> list = new ArrayList<>();

        System.out.print("Quantos funcionarios voce deseja registrar: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Funcionario #" + (i + 1));
            System.out.printf("ID: ");
            int id = sc.nextInt();

            sc.nextLine();
            System.out.printf("\nNome: ");
            String nome = sc.nextLine();

            System.out.printf("\nSalario: ");
            double salario = sc.nextDouble();

            boolean idExists = false;
            for (Funcionario f : list) {
                if (f.getId() == id) {
                    System.out.println("\nEste ID ja existe na Lista");
                    idExists = true;
                    break;
                }
            }

            if (!idExists) {
                Funcionario funcionario = new Funcionario(id, nome, salario);
                list.add(funcionario);
            } else {
                i--;
            }
        }

        System.out.printf("Entre com o id do funcionario que deve receber o aumento: ");
        int idAumento = sc.nextInt();

        Funcionario fun = list.stream().filter(x -> x.getId() == idAumento).findFirst().orElse(null);

        if (fun == null) {
            System.out.println("Esse id nao existe");
        } else {
            System.out.printf("\nEntre com a porcentagem do aumento: ");
            double aumento = sc.nextDouble();
            fun.aumentaSalario(aumento);
        }

        for (Funcionario f : list) {
            System.out.println(f.toString());
        }

        sc.close();
    }
}