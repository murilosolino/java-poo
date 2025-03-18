package herancaPolimorfismo.polimorfismo.exercicio.application;

import herancaPolimorfismo.polimorfismo.exercicio.entities.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramProduct {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        System.out.print("Enter the numbers of products: ");
        int nProducts = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < nProducts; i++) {
            System.out.println("\nProduct #" + (i+1) + " data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char CUI = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("\nName: ");
            String name = sc.nextLine();

            System.out.print("\nPrice: ");
            double price = sc.nextDouble();

            if (CUI == 'i'){
                System.out.print("\nCustom fee: ");
                double customFee = sc.nextDouble();
                sc.nextLine();
                Product product = new ImportedProduct(name, price, customFee);
                products.add(product);
            } else if (CUI == 'u') {
                System.out.print("\nManufacture Date (dd/MM/yyyy): ");
                String manufactureDate = sc.next();
                Product product = new UsedProduct(name, price, LocalDate.parse(manufactureDate, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                products.add(product);
            } else {
                Product product = new Product(name, price);
                products.add(product);
            }
        }

        System.out.println("PAYMENTS: ");
        for (Product p : products){
            System.out.println(p.priceTag());
        }

        sc.close();
    }
}
