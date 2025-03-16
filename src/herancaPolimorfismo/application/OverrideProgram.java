package herancaPolimorfismo.application;

import herancaPolimorfismo.entities.Account;
import herancaPolimorfismo.entities.BusinessAccount;
import herancaPolimorfismo.entities.SavingAccount;

public class OverrideProgram {
    public static void main(String[] args) {
        Account account = new Account(1000,"Alex", 1000);
        account.withdraw(200);
        System.out.println(account.getBalance());

        Account account1 = new SavingAccount(1000,"Bob", 1000,0.01);
        account1.withdraw(200);
        System.out.println(account1.getBalance());

        Account acc3 = new BusinessAccount(1000,"Ana", 1000,500);
        acc3.withdraw(200);
        System.out.println(acc3.getBalance());

    }
}
