package arquivos.application.exercicio.entities;

public class Product {

    private String nome;
    private Double preco;
    private Integer quantidade;

    public Product(String nome, Double preco, Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getName() {
        return nome;
    }

    public void setName(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public double precoTotal(){
        return preco * quantidade;
    }
}

