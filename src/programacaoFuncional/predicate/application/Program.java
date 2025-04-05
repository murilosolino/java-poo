package programacaoFuncional.predicate.application;

import programacaoFuncional.comparator.entities.Product;
import programacaoFuncional.predicate.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV",900.0));
        list.add(new Product("NoteBook",1200.0));
        list.add(new Product("Tablet",450.00));
        list.add(new Product("Mouse", 80.0));
        list.add(new Product("KeyBoard", 70.0));

        list.removeIf(new ProductPredicate());

        for (Product p : list){
            System.out.println(p);
        }

    }
}
