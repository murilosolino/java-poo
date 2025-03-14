package EstruturaSequencial.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class EX5 {
    /*Fazer um programa para ler o codigo de uma peca1, numero de pecas1, o valor unitarios de cada peca1,
    * o codigo de uma peca 2, numero de pecas2, o valor unitarios de cada peca2*/
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1, cod2, qtd1, qtd2;
        double preco1, preco2;

        cod1 = sc.nextInt();
        qtd1 = sc.nextInt();
        preco1 = sc.nextDouble();

        cod2 = sc.nextInt();
        qtd2 = sc.nextInt();
        preco2 = sc.nextDouble();

        double total = preco1 * qtd1 + preco2 * qtd2;
        System.out.printf("%.2f",total);

        sc.close();
    }

}
