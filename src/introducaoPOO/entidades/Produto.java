package introducaoPOO.entidades;

import java.util.Locale;
import java.util.Scanner;

public class Produto {

    private String nome;
    private double preco;
    private int qtdEstoque;
    private double valorTotalEstoque;

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", qtdEstoque=" + qtdEstoque +
                ", valorTotalEstoque=" + valorTotalEstoque +
                '}';
    }

    public void cadastraProduto(Scanner scanner) {

        System.out.println("Digite o nome do produto:");
        this.nome = scanner.next();

        System.out.println("Digite o preco do produto:");
        this.preco = scanner.nextDouble();

        System.out.println("Digite a quantidade em estoque:");
        this.qtdEstoque = scanner.nextInt();


        valorTotalDoEstoque();
    }

    public void removeQtdEmEstoque(Scanner scanner) throws Exception {
        System.out.println("Qual a quantidade de " + this.nome + "Que deseja remover do estoque?");
        System.out.println("Saldo do estoque para " + this.nome + ": " + this.qtdEstoque);
        int qtdRemover = scanner.nextInt();

        if (qtdRemover > qtdEstoque){
            throw new Exception("Estoque nao pode ser negativo");
        }

        this.qtdEstoque -= qtdRemover;
        valorTotalDoEstoque();
    }

    public void valorTotalDoEstoque(){
        this.valorTotalEstoque =  this.preco * qtdEstoque;
    }
}
