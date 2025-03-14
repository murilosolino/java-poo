package EstruturaRepetitiva.For;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = n; i > 0; i--){

            if (6%i == 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
