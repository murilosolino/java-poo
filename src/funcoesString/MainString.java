package funcoesString;

public class MainString {
    public static void main(String[] args) {
        String original = " abcd EFGHI jklm NOPQ";

        System.out.println(original);

        // Transformar em minusculas
        String s1 = original.toLowerCase();
        System.out.println(s1);

        // TRANSFORMA EM MAIUSCULAS
        String s2 = original.toUpperCase();
        System.out.println(s2);

        //remove os espacos do comeco e final da string
        String s3 =original.trim();
        System.out.println(s3);

        //Fazendo uma substring a partir de um caractere
        String s4 = original.substring(2);
        System.out.println(s4);

        // Fazendo uma substring a partir de um carcacter ate outro determinado caracter
        String s5 = original.substring(2,9);
        System.out.println(s5);

        //Troca um caracter por outro
        String s6 = original.replace("abc", "xy");
        System.out.println(s6);

        // Pega o indice de um substring / caractere de uma String
        int i = original.indexOf("bc");
        // Pega o ultimo indice de uma substring / caractere
        int j = original.lastIndexOf("lm");
        System.out.println(i);
        System.out.println(j);

        //Recorta a string por um separador e trasforma em um array
        String[] s7 = original.split(" "); // Separador eh o caracter de espaco

        for (int x =0; x < s7.length; x ++){
            System.out.println(s7[x]);
        }



    }
}
