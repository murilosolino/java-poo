package introducaoPOO.exercicios.vetores.ex1;

import introducaoPOO.exercicios.vetores.ex1.entidades.Pessoa;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantas pessoas serao digitadas");
        int n = sc.nextInt();
        Pessoa[] vect = new Pessoa[n];

        for (int i = 0; i < vect.length ; i++) {
            sc.nextLine();

            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.printf("Nome: ");
            String nome = sc.nextLine();

            System.out.printf("\nIdade: ");
            int idade = sc.nextInt();

            vect[i] = new Pessoa(nome, idade);

        }

        Pessoa velho = new Pessoa("AUX", 0);
        for (int i = 0; i < vect.length ; i++) {
            if (vect[i].getIdade() > velho.getIdade()){
                velho = vect[i];
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + velho.getNome());
        sc.close();
    }
}
