package interfaces.exercicio.application;


import interfaces.exercicio.model.entities.Contract;
import interfaces.exercicio.model.entities.Installments;
import interfaces.exercicio.model.services.ContractService;
import interfaces.exercicio.model.services.PayPalService;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Numero:");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("\nData (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.print("\nValor do Contrato: ");
        double totalValue = sc.nextDouble();
        System.out.print("\nEntre com o numero de parcelas: ");
        int months = sc.nextInt();
        System.out.println();

        Contract contract =  new Contract(number,date,totalValue);
        ContractService service = new ContractService(new PayPalService());
        service.processContract(contract, months);

        System.out.println("PARCELAS:");
        for (Installments ic : contract.getInstallments()){
            System.out.println(ic);
        }

        sc.close();
    }
}
