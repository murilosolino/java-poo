package EstruturaRepetitiva.For;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i <= n; i++){

            double a = sc.nextDouble();
            double b = sc.nextDouble();

            if (b == 0){
                System.out.println("divisao impossivel");
            } else {

                double divisao = a / b;
                System.out.println(divisao);

            }
        }
        sc.close();
    }

}
