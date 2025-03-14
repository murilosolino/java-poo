package introducaoPOO.exercicios.vetores.ex1;

import introducaoPOO.exercicios.vetores.ex1.entidades.Estudante;
import introducaoPOO.exercicios.vetores.ex1.entidades.Quarto;

import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantos quartos deseja alugar? ");
        int n = sc.nextInt();
        Quarto[] quartos = new Quarto[9];
        for (int i = 0; i < n ; i++) {
            System.out.println("\nALUGUEL #" + (i +1));
            sc.nextLine();
            System.out.printf("\nNome: ");
            String nome = sc.nextLine();
            System.out.printf("\nEmail: ");
            String email = sc.nextLine();
            System.out.printf("\nQuarto: ");
            int quartoID = sc.nextInt();

            Estudante estudante = new Estudante(nome, email);
            Quarto quartoOcupado = new Quarto(estudante);
            quartos[quartoID] = quartoOcupado;

        }

        System.out.println("Quartos Ocupados");
        for (int i = 0; i < quartos.length ; i++) {
            if (quartos[i] != null){
                System.out.println(i + ": " + quartos[i].getEstudante());
            }
        }

        sc.close();
    }
}
