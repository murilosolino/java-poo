package introducaoPOO.exercicios.ex3;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String name = sc.nextLine();

        System.out.println("Digite a nota do primeiro trimestre:");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a nota do segundo trimestre:");
        double nota2 = sc.nextDouble();

        System.out.println("Digite a nota do terceiro trimestre:");
        double nota3 = sc.nextDouble();

        Student student = new Student(name, nota1, nota2, nota3);

        System.out.println(student);

        sc.close();
    }
}
