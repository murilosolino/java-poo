package generics.curingas.principioGetPut;

import java.util.ArrayList;
import java.util.List;

public class Contravariancia {
    /*Na Contravariancia sao permitidas operacoes de PUT mas nao de GET*/
    public static void main(String[] args) {
        List<Object> myObjs = new ArrayList<>();
        myObjs.add("Maria");
        myObjs.add("Alex");

        /*Quando usado eh usado super significa que a lista aceitara neste caso
        qualquer tipo Number ou de seu Supertipo. No caso Object*/
        List<? super Number> myNums = myObjs;

        myNums.add(10);
        myNums.add(30.0);

        /*Neste caso o erro corre por que o tipo da lista pode ser um supertipo de Number.
        * Logo o compilador nao consegue indentificar qual o tipo que esta sendo retornando
        * impossibilitando a atribuicao a uma varivael*/

        //Number x = myNums.get(0):  erro de compilacao


    }
}
