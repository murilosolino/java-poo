package generics.delimitados.application;

import generics.delimitados.entities.Product;
import generics.delimitados.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        String path = "src\\generics\\delimitados\\application\\in.txt.";
        List<Product> productList = new ArrayList<>();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {

            String aux = bufferedReader.readLine();
            while (aux != null){
                String[] fields = aux.split(",".trim());
                Product product = new Product(fields[0],Double.parseDouble(fields[1]));
                productList.add(product);
                aux = bufferedReader.readLine();
            }

            Product x = CalculationService.max(productList);
            System.out.println("Most expensive: " + x);

        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
