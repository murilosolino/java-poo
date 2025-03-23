package herancaPolimorfismo.abstratos.exercicio.application;

import herancaPolimorfismo.abstratos.exercicio.entities.Contribuinte;
import herancaPolimorfismo.abstratos.exercicio.entities.PessoaFisica;
import herancaPolimorfismo.abstratos.exercicio.entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Contribuinte> list = new ArrayList<>();

        System.out.print("Enter the number od tax payers: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n ; i++) {
            System.out.println("Tax payer #" + (i + 1) + " data:");
            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("\nName: ");
            String name = sc.nextLine();
            System.out.print("\nAnual Income: ");
            double anualIncome = sc.nextDouble();

            if (type == 'i'){
                System.out.print("\nHealth expenditures: ");
                double healthExpenditures = sc.nextDouble();
                PessoaFisica pf = new PessoaFisica(name, anualIncome, healthExpenditures);
                list.add(pf);
            } else if (type == 'c'){
                System.out.print("\nNumber of employees: ");
                int nEmployees = sc.nextInt();
                PessoaJuridica pj = new PessoaJuridica(name, anualIncome, nEmployees);
                list.add(pj);
            } else {
                System.out.println("Tipo nao registrado. Programa finalizado");
            }
        }

        System.out.println("TAXES PAID");
        double totalTaxes = 0;
        for (Contribuinte c : list){
            System.out.println(c.getNome() + ": $" + String.format("%.2f", c.imposto()));
            totalTaxes += c.imposto();
        }

        System.out.println("Total Taxes: $ " + String.format("%.2f", totalTaxes));
    }
}
