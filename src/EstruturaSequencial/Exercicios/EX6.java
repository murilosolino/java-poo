package EstruturaSequencial.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class EX6 {
    /*Fazer um programa que leia tres valores de ponto flutuante de dupla precisao A, B e C. Em seguid, calcule e mostre:
    * a) Area do triangulor etangulo que tem A por base e C por altura
    * b) Area do circulo de raio C
    * c) Area do trapezio que tem A e B por bases e C por altura
    * d) Area do quadrado que tem lado B
    * e) Area do retangulo que tem lados A e B*/

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B,C;

        System.out.println("Digite 3 valor de ponto flutuante: ");
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        double areaTriangulo = (A * C) /2;
        double areaCirculo = Math.PI * (Math.pow(C,2));
        double areaTrapezio = (A + B) * C / 2;
        double areaQuadrado = Math.pow(B,2);
        double areaRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f", areaRetangulo);



    }
}
