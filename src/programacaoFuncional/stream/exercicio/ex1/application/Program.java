package programacaoFuncional.stream.exercicio.ex1.application;

import programacaoFuncional.comparator.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
         String path = "src\\programacaoFuncional\\stream\\exercicio\\ex1\\assets\\in.txt";

         try(BufferedReader bf = new BufferedReader(new FileReader(path))) {

             List<Product> list = new ArrayList<>();
             String line = bf.readLine();

             while (line != null){
                 String fields[] = line.split(",");
                 list.add(new Product(fields[0],Double.parseDouble(fields[1])));
                 line = bf.readLine();
             }

            double avg = list.stream()
                    .map(p-> p.getPrice())
                    .reduce(0.,(x,y) -> x+y) / list.size();

             System.out.println("AVG price: " + String.format("%.2f",avg));

             Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

             List<String> names = list.stream()
                     .filter(product -> product.getPrice() < avg)
                     .map(product -> product.getName())
                     .sorted(comp.reversed())
                     .toList();

             names.forEach(System.out::println);

         }catch (IOException e){
             System.out.println("Error: " + e.getMessage());
         }
    }
}
