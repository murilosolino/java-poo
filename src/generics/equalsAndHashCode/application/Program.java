package generics.equalsAndHashCode.application;

import generics.equalsAndHashCode.entities.Client;

public class Program {
    public static void main(String[] args) {
        Client c1 = new Client("Maria", "maria@email.com");
        Client c2 = new Client("Maria", "alex@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        System.out.println(c1.equals(c2));

    }
}
