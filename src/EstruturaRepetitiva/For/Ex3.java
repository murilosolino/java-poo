package EstruturaRepetitiva.For;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i <= n; i++){

            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double media = (a*2 + b*3 + c*5)/ 10;

            System.out.println(media);


        }


        sc.close();
    }
}
