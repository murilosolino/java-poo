package interfaces.comparable.application;

import interfaces.comparable.entities.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        String path = "src/interfaces/comparable/assets/in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String employeeCsv = br.readLine();
            while (employeeCsv != null){
                String[] fildes = employeeCsv.split(",");
                list.add(new Employee(fildes[0], Double.parseDouble(fildes[1])));
                employeeCsv = br.readLine();
            }

            Collections.sort(list);
            for (Employee e: list){
                System.out.println(e.getName() + ", " + e.getSalary());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
