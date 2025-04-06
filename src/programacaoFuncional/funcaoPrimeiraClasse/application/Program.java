package programacaoFuncional.funcaoPrimeiraClasse.application;

import programacaoFuncional.comparator.entities.Product;
import programacaoFuncional.funcaoPrimeiraClasse.service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV",900.00));
        list.add(new Product("NoteBook",1200.00));
        list.add(new Product("Tablet",450.00));
        list.add(new Product("Mouse", 80.00));
        list.add(new Product("KeyBoard", 70.00));

        ProductService ps = new ProductService();
        double filteredSum =  ps.filteredSum(list, product -> product.getName().charAt(0) == 'T');

        System.out.println(filteredSum);

    }
}
