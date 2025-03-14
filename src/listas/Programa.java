package listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Programa {

    public static void main(String[] args) {

        // como list eh uma interface para uma lista ser instanciada
        // uma classe que implementa a List deve ser chamada
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        list.add(2, "Marco"); // adiciona num indice exato


        for (String p : list){
            System.out.println(p);
        }

        System.out.println("------------------------------");
        list.remove("Anna"); // remove a partir de comparacao de valores
        list.remove(1); // remove pelo indice
        list.removeIf(x -> x.charAt(0) == 'M'); // remove a partir do predicado

        for (String p : list){
            System.out.println(p);
        }

        System.out.println("Index of Bob: " + list.indexOf("Marco")); // captura o valor a partir de comparacao de valores
        System.out.println("Index of Marco: " + list.indexOf("Marco")); // retorna -1 para elementos nao presentes na lista

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); // faz um filtro transformando a lista em lambda e transformando novamente para list

        for (String p : result){
            System.out.println(p);
        }

        System.out.println("------------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null); // encontra a primeira ocorrencia a partir de um filtro. se nenhum valor se adequar ao filtro o retorno eh null
        System.out.println(name);
    }

}
