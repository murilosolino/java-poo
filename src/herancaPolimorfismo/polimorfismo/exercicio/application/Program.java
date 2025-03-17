package herancaPolimorfismo.polimorfismo.exercicio.application;

import herancaPolimorfismo.polimorfismo.exercicio.entities.Employee;
import herancaPolimorfismo.polimorfismo.exercicio.entities.OutsiurcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();

        System.out.print("Enter the numbers of employees: ");
        int nEmployyes = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < nEmployyes; i++) {
            System.out.println("\nEmployee #" + (i+1) + " data: ");
            System.out.print("Outsourced(y/n)? ");
            char outsourcecd = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("\nName: ");
            String name = sc.nextLine();

            System.out.print("\nHours: ");
            int hours = sc.nextInt();

            System.out.print("\nValue per hour: ");
            double valuePerHour = sc.nextDouble();

            if (outsourcecd == 'y'){
                System.out.print("\nAdditional charge: ");
                double addtionalCharge = sc.nextDouble();
                Employee employee = new OutsiurcedEmployee(name, hours, valuePerHour, addtionalCharge);
                employeeList.add(employee);
            } else {
                Employee employee = new Employee(name, hours,valuePerHour);
                employeeList.add(employee);
            }
        }

        System.out.println("PAYMENTS: ");
        for (Employee e : employeeList){
            System.out.println(e.getName() + " - " + "$ " + e.payment());
        }

        sc.close();

    }
}
