package EstruturaRepetitiva.While;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int combustivel = scanner.nextInt();
        int alcool = 0, gasolina =0, diesel =0;


        while (combustivel != 4){

            if (combustivel < 1 || combustivel > 4){
                System.out.print("codigo invalido, digite um novo: ");
                combustivel = scanner.nextInt();
            }

            if (combustivel == 1){
                alcool++;
            } else if (combustivel == 2) {
                gasolina++;
            } else {
                diesel++;
            }

            combustivel = scanner.nextInt();

        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        scanner.close();
    }

}
