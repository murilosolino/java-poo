package generics.set.exercicio.ex2.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set A = new HashSet();
        Set B = new HashSet();
        Set C = new HashSet();

        System.out.printf("How many students for course A? ");
        int n = sc.nextInt();
        System.out.println();
        for (int i = 0; i < n; i++){
            A.add(sc.nextInt());
        }

        System.out.printf("How many students for course B? ");
        n = sc.nextInt();
        System.out.println();
        for (int i = 0; i < n; i++){
            B.add(sc.nextInt());
        }

        System.out.printf("How many students for course C? ");
        n = sc.nextInt();

        System.out.println();
        for (int i = 0; i < n; i++){
            C.add(sc.nextInt());
        }

        Set allCourse = new HashSet(A);
        allCourse.addAll(B);
        allCourse.addAll(C);

        System.out.println("Total students: " + allCourse.size());

        sc.close();
    }
}
