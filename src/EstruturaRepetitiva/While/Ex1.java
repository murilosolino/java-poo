package EstruturaRepetitiva.While;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senha = sc.next();

        while (!senha.equalsIgnoreCase("2002")){
            System.out.println("Senha invalida");
            senha = sc.next();
        }

        System.out.println("Acesso permitido");
        sc.close();
    }
}
