package EstruturaSequencial;

public class FuncoesMatematicas {
    public static void main(String[] args) {
        double x = 3.0;
        double y = 4.0;
        double z = -5;
        double A, B, C;

        A = Math.sqrt(x); // raiz quadrada
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.printf("Raiz quadrada de %.2f: %f %n", x, A );
        System.out.printf("Raiz quadrada de %.2f: %.2f %n", y, B );
        System.out.printf("Raiz quadrada de 25: %.2f %n", C );

        A = Math.pow(x, y); // potencia
        B = Math.pow(x, 2.0);
        C = Math.pow(5, 2);
        System.out.printf("%.2f elevado ao %.2f: %.2f %n", x, y, A );
        System.out.printf("%.2f elevado ao quadrado: %.2f %n", x, B );
        System.out.printf("5 elevado ao quadrado: %.2f %n", C );



        A = Math.abs(x); // valor absoluto
        B = Math.abs(z);
        System.out.printf("valor absoluto de %.2f: %.2f %n", x, A );
        System.out.printf("valor absoluto de %.2f: %.2f %n", z, B );

    }
}
