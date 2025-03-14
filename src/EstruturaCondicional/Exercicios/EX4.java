package EstruturaCondicional.Exercicios;

import java.util.Scanner;

public class EX4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cod;
        double total = 0;
        double valor, qtd;

        cod = scanner.nextInt();
        qtd = scanner.nextDouble();

        switch (cod){
            case 1:
                valor = 4.00;
                total = qtd * valor;
                break;
            case 2:
                valor = 4.50;
                total = qtd * valor;
                break;
            case 3:
                valor = 5.00;
                total = qtd * valor;
                break;
            case 4:
                valor = 2.00;
                total = qtd * valor;
                break;
            case 5:
                valor = 1.50;
                total = qtd * valor;
                break;
            default:
                break;
        }

        System.out.printf("TOTA: R$ %.2f", total);
        scanner.close();
    }

}
