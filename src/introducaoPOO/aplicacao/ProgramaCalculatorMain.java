package introducaoPOO.aplicacao;

import introducaoPOO.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaCalculatorMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o raio: ");
        double raio = sc.nextDouble();

        System.out.printf("Circunferencia: %.2f\n", Calculator.circuferencia(raio));
        System.out.printf("Volume: %.2f\n",  Calculator.volume(raio));

        sc.close();
    }
}
