package programacaoFuncional.stream.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        //Instanciando uma stream a partir de uma lista
        Stream<Integer> st1 = list.stream().map(x -> x * 10); // percorre a stream aplicando uma funcao em cada elemento e retornando um resultado

        // converte a srteam em array com toArray e depois converte o array em String e imprime na tela
        System.out.println(Arrays.toString(st1.toArray()));

        //Instanciando uma Stream com Stream.of
        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
        System.out.println(Arrays.toString(st2.toArray()));

        //Stream com regra de funcao de iteracao
        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(st3.limit(10).toArray()));

        // Fibonacci
        Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]}).map(p->p[0]);
        System.out.println(Arrays.toString(st4.limit(10).toArray()));

    }
}
