package generics.curingas.principioGetPut;

import java.util.ArrayList;
import java.util.List;

public class Covariancia {
    /*Na Covariancia sao permitidas operacoes de Get mas nao de PUT*/
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(20);

        List<? extends Number> list = intList;
        Number x = list.get(0); // sem erros ao acessar elementos

        /*O erro ocorre pois o compilador nao consegue garatir que o tipo passado no parametro de add()
        * sera um tipo correspondente com um possivel subtipo de Number que possa ser a lista*/
        // list.add(40): erro de compilacao


    }
}
