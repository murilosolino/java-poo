package programacaoFuncional.consumer.application;

import programacaoFuncional.comparator.entities.Product;
import programacaoFuncional.consumer.util.ProductUpdate;

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

        // forEach percorre a lista aplicando a regra do consumer
        list.forEach(new ProductUpdate());

        //imprimindo a lista por metodo de referencia
        list.forEach(System.out::println);
    }
}
