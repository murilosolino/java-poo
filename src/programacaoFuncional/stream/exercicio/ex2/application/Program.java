package programacaoFuncional.stream.exercicio.ex2.application;

import programacaoFuncional.comparator.entities.Product;
import programacaoFuncional.stream.exercicio.ex2.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String path = "src\\programacaoFuncional\\stream\\exercicio\\ex2\\assets\\in.txt";
        System.out.printf("Enter a salary: ");
        double salary = sc.nextDouble();
        System.out.println();

        try(BufferedReader bf = new BufferedReader(new FileReader(path))) {

            List<Employee> list = new ArrayList<>();
            String line = bf.readLine();

            while (line != null){
                String fields[] = line.split(",");
                list.add(new Employee(fields[0],fields[1], Double.parseDouble(fields[2])));
                line = bf.readLine();
            }

          List<String> emailSalaryIsMore = list.stream()
                  .filter(employee -> employee.getSalary() > salary)
                  .map(employee -> employee.getEmail())
                  .sorted()
                  .toList();

          emailSalaryIsMore.forEach(System.out::println);


        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
