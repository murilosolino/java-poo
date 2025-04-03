package generics.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("TV");
        set.add("NOTEBOOK");
        set.add("Television");

        set.remove("TV");

        System.out.println(set.contains("TV"));

        for (String s : set){
            System.out.println(s);
        }

        System.out.println();

        Set<String> treeSet = new TreeSet<>();

        treeSet.add("Tv");
        treeSet.add("NOTEBOOK");
        treeSet.add("Tablet");

        treeSet.removeIf(x -> x.length() >= 3);

        System.out.println(treeSet.contains("TV"));

        for (String s : treeSet){
            System.out.println(s);
        }

        System.out.println();

        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("TV");
        linkedHashSet.add("NOTEBOOK");
        linkedHashSet.add("Television");

        System.out.println(linkedHashSet.contains("TV"));

        for (String s : linkedHashSet){
            System.out.println(s);
        }
    }
}
