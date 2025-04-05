package programacaoFuncional.comparator.application;
import programacaoFuncional.comparator.entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV",900.0));
        list.add(new Product("NoteBook",1200.0));
        list.add(new Product("Tablet",450.00));

        //Comparator com expressao lambda
        // Arrow Function
        Comparator<Product> comp = (p1, p2) -> {
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };

        /*Quando a expressao lambada contem apenas 1 linha ela dispensa o uso de return e chaves
        *
        *  Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        * */

        /*Eh possivel passar a expressao lambda direto no argumento da funcao.
         *
         *  list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());)
         * */

        list.sort(comp);

        for (Product s : list){
            System.out.println(s.toString());
        }
    }
}
