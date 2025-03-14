package introducaoPOO.exercicios.vetores.ex1;

import introducaoPOO.exercicios.vetores.ex1.entidades.Aluno;
import introducaoPOO.exercicios.vetores.ex1.entidades.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantas pessoas serao digitadas");
        int n = sc.nextInt();
        Pessoa[] vect = new Pessoa[n];
        double altura;
        String genero;
        double somaAlturaMulheres =0;
        int contagemMulheres = 0;
        int contagemHomens = 0;

        for (int i = 0; i < vect.length ; i++) {
            System.out.println("Digite a altura da " + (i+1) + "a pessoa");
            altura = sc.nextDouble();
            System.out.println("Digite o genero da " + (i+1) + "a pessoa");
            genero = String.valueOf(sc.next().charAt(0));

            if (genero.equalsIgnoreCase("F")){
                contagemMulheres++;
               somaAlturaMulheres += altura;
            } else {
                contagemHomens++;
            }

            vect[i] = new Pessoa(altura,genero);
        }


        double maior = vect[1].getAltura();
        double menor = vect[1].getAltura();
        for (int i = 0; i < vect.length ; i++) {
            if (vect[i].getAltura() > maior){
                maior = vect[i].getAltura();
            }

            if (vect[i].getAltura() < menor){
                menor = vect[i].getAltura();
            }
        }

        double media = somaAlturaMulheres / contagemMulheres;

        System.out.println("MENOR ALTURA = " + menor);
        System.out.println("MAIOR ALTURA = " + maior);
        System.out.printf("MEDIA ALTURA MULHERES = %.2f\n " + media);
        System.out.println("NUMERO DE HOMENS = " + contagemHomens);
        sc.close();
    }
}
