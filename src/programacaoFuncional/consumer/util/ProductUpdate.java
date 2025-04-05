package programacaoFuncional.consumer.util;

import programacaoFuncional.comparator.entities.Product;

import java.util.function.Consumer;

public class ProductUpdate implements Consumer<Product> {
    @Override
    public void accept(Product product) {
        product.setPrice(product.getPrice() * 1.1);
    }
}

/*
A interface Consumer em Java é usada para representar uma operação que aceita um único argumento de entrada e não retorna nenhum resultado.
Ela é parte do pacote java.util.function e é uma interface funcional, o que significa que pode ser usada como o destino para uma expressão
lambda ou referência de metodo.

A vantagem de usar a interface Consumer em vez de criar um metodo diretamente na classe do objeto é a flexibilidade
e a reutilização de código. Aqui estão alguns pontos que destacam essa vantagem:

Separação de Responsabilidades: Usar Consumer permite separar a lógica de processamento dos dados da definição da classe.
Isso segue o princípio de responsabilidade única, tornando o código mais modular e fácil de manter.

Reutilização de Código: Um Consumer pode ser reutilizado em diferentes contextos e com diferentes tipos de listas ou coleções,
sem a necessidade de duplicar a lógica de processamento.

Facilidade de Testes: Separar a lógica em um Consumer facilita a criação de testes unitários para essa lógica específica,
sem depender do estado interno da classe do objeto.

Flexibilidade: Permite passar diferentes comportamentos para métodos que aceitam um Consumer, como forEach, sem modificar a classe original.*/
