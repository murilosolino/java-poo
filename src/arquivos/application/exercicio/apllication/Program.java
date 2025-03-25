package arquivos.application.exercicio.apllication;

import arquivos.application.exercicio.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        String strPath = "C:\\Users\\muril\\dev\\ws-java\\CursoJava\\src\\arquivos\\application\\exercicio\\assets\\input.csv";
        File path = new File(strPath);
        List<Product> list = new ArrayList<>();

        try(BufferedReader bf = new BufferedReader(new FileReader(path))){
            String line = bf.readLine();
            while (line != null){
                String[] vet = line.split(",");
                String name = vet[0];
                Double preco = Double.parseDouble(vet[1].trim());
                Integer quantidade = Integer.parseInt(vet[2].trim());

                Product product = new Product(name,preco,quantidade);
                list.add(product);
                line = bf.readLine();
            }

        }catch (IOException e){
            e.printStackTrace();
        }

       new File(path.getParent(), "\\out").mkdir();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path.getParent() + "\\out\\summary.csv", true))){
            for (Product product : list){
                bw.write(product.getName() + "," + product.precoTotal());
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
