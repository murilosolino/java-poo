package generics.curingas.application;

import generics.curingas.entities.Circle;
import generics.curingas.entities.Rectangle;
import generics.curingas.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2));
        myCircles.add(new Circle(3));

        System.out.println("Total Area: " + totalArea(myCircles));
    }

    // Utilizando o tipo curinga "? + o extends - "? extends Shape" o metodo aceita uma Lista que seja qualquer subtipo de shape
    // Entretando desta forma poderemos apenas ler os dados da lista
    // Caso tentar adicionar um elemento o compilador acusara erro pois ele nao consegue saber qual tipo estamos passando no parametro
    // e indentificar se o tipo que estamos adicionando eh o mesmo que passado no parametro.
    private static double totalArea(List<? extends Shape> list) {
        double sum =0;
        for (Shape shape: list){
            sum += shape.area();
        }
        return sum;
    }
}
