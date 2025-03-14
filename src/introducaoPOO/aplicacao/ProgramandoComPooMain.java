package introducaoPOO.aplicacao;

import introducaoPOO.entidades.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class ProgramandoComPooMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Entre com as medidas do triangulo x:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Entre com as medidas do triangulo Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.println("Area de X: " + areaX);
        System.out.println("Area de Y: " + areaY);

        maiorArea(areaX, areaY);

        sc.close();
    }

    public static void maiorArea(double x, double y) {
        if (x > y) {
            System.out.println("Maior Area: X");
        } else if (y > x) {
            System.out.println("Maior Area: Y");
        } else {
            System.out.println("Areas sao iguais");
        }
    }
}
