package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x;
        x  = sc.next(); //le ate o primeiro caractere de espaco
        System.out.println("Voce digitou: " + x );

        int y;
        y  = sc.nextInt();
        System.out.println("Voce digitou: " + y );

        double z;
        z  = sc.nextDouble();
        System.out.println("Voce digitou: " + z );

        //ler um caracter
        char alpha;
        alpha  = sc.next().charAt(0);
        System.out.println("Voce digitou: " + alpha );

        //LER UM TEXTO ATE A QUEBRA DE LINHA
        String beta;
        String delta;
        String gama;

        sc.nextLine(); // CAPUTRA A QUEBRA DE LINHA DO NEXT() ANTERIOR
        beta = sc.nextLine();
        delta = sc.nextLine();
        gama = sc.nextLine();

        System.out.println("DADOS DIGITADOS COM NEXTLINE");
        System.out.println(beta);
        System.out.println(delta);
        System.out.println(gama);

        sc.close();
    }
}
