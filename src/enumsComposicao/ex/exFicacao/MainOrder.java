package enumsComposicao.ex.exFicacao;

import enumsComposicao.ex.exFicacao.entities.Client;
import enumsComposicao.ex.exFicacao.entities.Order;
import enumsComposicao.ex.exFicacao.entities.OrderItem;
import enumsComposicao.ex.exFicacao.entities.Product;
import enumsComposicao.ex.exFicacao.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class MainOrder {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("\nEmail: ");
        String email = sc.nextLine();
        System.out.print("\nBirth date (DD/MM/YYYY): ");
        String birthDate = sc.nextLine();
        Client client = new Client(name, email, LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("Enter order data");
        System.out.print("Status: ");
        String status = sc.nextLine();
        System.out.print("\nHow many items to this order?: ");
        int nItems = sc.nextInt();
        sc.nextLine();

        Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(status), client);

        for (int i = 0; i < nItems; i++) {
            System.out.println("Enter #" + (i+1) + " item data: ");
            System.out.print("Product Name: ");
            String  productName = sc.nextLine();
            System.out.print("\nProduct Price: ");
            double productPrice = sc.nextDouble();
            System.out.print("\nQuantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            OrderItem orderItem = new OrderItem(quantity, productPrice, new Product(productName, productPrice));
            orderItem.setPrice(orderItem.subTotal());
            order.addItem(orderItem);

        }

        System.out.println("Order Summary:");
        System.out.println("Order moment: " + order.getMoment());
        System.out.println("Order status: " + order.getStatus());
        System.out.println("Client: " + client.getName() + " " + client.getBirthDate() + " - " + client.getEmail());
        System.out.println("Order Items: ");
        order.OrderItems();
        System.out.println("Total Price: " + order.total());
        sc.close();
    }
}
