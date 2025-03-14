package introducaoPOO.aplicacao;

import introducaoPOO.entidades.Produto;

import java.util.Locale;
import java.util.Scanner;


public class ProgramaExercicioProduto {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Produto p1 = new Produto();
        p1.cadastraProduto(scanner);
        System.out.println(p1);

        p1.removeQtdEmEstoque(scanner);
        System.out.println(p1);
    }
}
