package programacaoFuncional.function.application;

import programacaoFuncional.comparator.entities.Product;
import programacaoFuncional.function.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV",900.00));
        list.add(new Product("NoteBook",1200.00));
        list.add(new Product("Tablet",450.00));
        list.add(new Product("Mouse", 80.00));
        list.add(new Product("KeyBoard", 70.00));

        // a funcao map aplica a implementacao de Function em cada elemento de list
        List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());


        //imprimindo a lista por metodo de referencia
        names.forEach(System.out::println);
    }
}
