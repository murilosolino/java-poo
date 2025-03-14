package introducaoPOO.exercicios.vetores.ex1;

import introducaoPOO.exercicios.vetores.ex1.entidades.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantas pessoas serao digitadas");
        int n = sc.nextInt();
        Aluno[] vect = new Aluno[n];
        String nome;
        double nota1 =0, nota2 =0;

        for (int i = 0; i < vect.length ; i++) {
            sc.nextLine();
            System.out.println("Digite o nome, primeira e segunda nota do " + (i+1) + " aluno");
            nome = sc.nextLine();
            nota1 = sc.nextDouble();
            nota2 = sc.nextDouble();

            double media  = (nota1 + nota2) /2;

            vect[i] = new Aluno(nome, nota1, nota2, media);
        }

        System.out.println("ALUNOS APROVADOS");
        for (int i = 0; i < vect.length ; i++) {
            if (vect[i].getMedia() >= 6.0){
                System.out.println(vect[i].getNome());
            }

        }
        sc.close();
    }
}
