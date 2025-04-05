package programacaoFuncional.function.util;

import programacaoFuncional.comparator.entities.Product;

import java.util.function.Function;


//Function recebe um Tipo de Entrada e outro de Saida (Product, String)
public class UpperCaseName implements Function<Product, String> {
    @Override
    public String apply(Product product) {
        return product.getName().toUpperCase();
    }
}

