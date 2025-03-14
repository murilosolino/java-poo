package EstruturaSequencial.Exercicios;

import java.util.Scanner;

public class EX3 {
    /*Faca um programa para ler quatro valores A, B, C e D. A seguir calcule a diferenca do produto de A*B pelo produto de C*D.*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A,B,C,D;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        int diferenca = (A*B - C*D);
        System.out.println("Diferenca = " + diferenca);
        sc.close();
    }
}
