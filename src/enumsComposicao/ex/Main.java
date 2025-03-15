package enumsComposicao.ex;

import enumsComposicao.ex.entidades.Department;
import enumsComposicao.ex.entidades.HourContract;
import enumsComposicao.ex.entidades.Worker;
import enumsComposicao.ex.entidades.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.printf("Entre com o nome do departamento: ");
        String department = scanner.nextLine();

        System.out.println("\nEntre com o nome do trabalhador");
        String workerName = scanner.nextLine();

        System.out.println("Entre com o Level deste trabalhador");
        String level = scanner.nextLine();
        WorkerLevel wl = WorkerLevel.valueOf(level);

        System.out.println("Entre com o salario base deste trabalhador");
        double baseSalary = scanner.nextDouble();

        System.out.print("Quantos contratos esse trabalhador possui? ");
        int nContracts = scanner.nextInt();

        Worker worker = new Worker(workerName, wl, baseSalary, new Department(department));

        scanner.nextLine();
        for (int i = 0; i < nContracts ; i++) {
            System.out.println("\nEntre com os dados do contrato #" + (i+1));
            System.out.print("Data (DD/MM/YYYY): ");
            Date date = sdf.parse(scanner.next());

            System.out.print("\nValor por hora: ");
            double valuePerHour = scanner.nextDouble();

            System.out.print("\nHoras totais do cvontrato: ");
            int hours = scanner.nextInt();
            scanner.nextLine();

            HourContract contract = new HourContract(date, valuePerHour, hours);

            worker.addContract(contract);
        }


        System.out.print("Entre com o mes e ano que deseja calcular o valor total do contrato (MM/YYYY)");
        String monthAndYear = scanner.next();
        int year = Integer.parseInt(monthAndYear.substring(3));
        int month = Integer.parseInt(monthAndYear.substring(0,2));

        System.out.println("Nome : " + worker.getName());
        System.out.printf("Departamento : " + worker.getDepartment().getName());
        System.out.println("\nTotal do mes: " + monthAndYear + " : " + String.format("%.2f",worker.income(year,month)));
        scanner.close();

    }

}
