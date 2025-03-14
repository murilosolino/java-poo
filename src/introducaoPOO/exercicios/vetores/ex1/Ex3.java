package introducaoPOO.exercicios.vetores.ex1;

import introducaoPOO.exercicios.vetores.ex1.entidades.Pessoa;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantas pessoas serao digitadas");
        int n = sc.nextInt();
        Pessoa[] vect = new Pessoa[n];
        double somaAltura = 0;
        int menores =0;
        ArrayList<Pessoa> menores16 = new ArrayList<>();

        for (int i = 0; i < vect.length ; i++) {
            sc.nextLine();

            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.printf("Nome: ");
            String nome = sc.nextLine();

            System.out.printf("\nIdade: ");
            int idade = sc.nextInt();
            if (idade < 16){
                menores++;
            }

            System.out.printf("\nAltura: ");
            double altura = sc.nextDouble();
            somaAltura += altura;

            vect[i] = new Pessoa(nome, idade, altura);

            if (vect[i].getIdade() < 16){
                menores16.add(vect[i]);
            }

        }

        double porcentagemMenores16 = ((double) menores / vect.length) * 100.0;
        System.out.println("Altura media: " + somaAltura / vect.length);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagemMenores16);

        for(Pessoa p : menores16){
            System.out.println(p.getNome());
        }

    sc.close();
    }
}
