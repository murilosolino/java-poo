package EstruturaRepetitiva.For;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x  = scanner.nextInt();
        int in=0, out = 0;
        for (int i =0; i <= x; i++){
           int N = scanner.nextInt();

            if (N >= 10 && N <= 20){
                in++;
            } else {
                out++;
            }
        }

        System.out.println(in + "in");
        System.out.println(out + "out");

        scanner.close();
    }
}
