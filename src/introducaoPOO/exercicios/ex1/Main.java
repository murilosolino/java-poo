package introducaoPOO.exercicios.ex1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Digite o valor da base do retangulo: ");
        retangulo.base = sc.nextDouble();

        System.out.println("Digite o valor da altura do retangulo: ");
        retangulo.altura = sc.nextDouble();

        double areaRetangulo = retangulo.area();
        double perimetroRetangulo = retangulo.perimetro();
        double diagonalRetangulo = retangulo.diagonal();

        System.out.println("AREA = " + areaRetangulo);
        System.out.println("PERIMETRO = " + perimetroRetangulo);
        System.out.println("DIAGONAL = " + diagonalRetangulo);
    }
}
