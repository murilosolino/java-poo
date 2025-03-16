package herancaPolimorfismo.application;

import herancaPolimorfismo.entities.Account;
import herancaPolimorfismo.entities.BusinessAccount;
import herancaPolimorfismo.entities.SavingAccount;

public class Program {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500);

        //UPCASTING -- Converte um objeto da subclasse para superclasse
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003,"Bob",0,200);
        Account acc3 = new SavingAccount(1004, "Ana", 0, 0.01);
        System.out.println(acc1.toString());
        System.out.println(acc3.toString());
        System.out.println(acc2.toString());

  // Downcasting -- Converte um objeto da superclasse para subclasse
        // Não devemos fazer casting forçado para downcasting, como por exemplo:
        // BusinessAccount acc5 = (BusinessAccount) acc3;
        // Isso pode causar erros em tempo de execução (ClassCastException) se o objeto não for realmente uma instância da subclasse.
        // É importante verificar o tipo do objeto antes de fazer o downcasting usando o operador instanceof.

        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(500);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingAccount){
            SavingAccount acc5 = (SavingAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }

    }
}
