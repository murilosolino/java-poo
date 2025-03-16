package herancaPolimorfismo.entities;

/*Quando uma classe ou metodo possuem 'final' na declaracao, significa que eles nao podem ser herdados nem sobreescritos*/
public final class SavingAccount extends Account {

    private double interestRate;

    public SavingAccount(){
        super();
    }

    public SavingAccount(int number, String holder, double balance, double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "interestRate=" + interestRate +
                "} " + super.toString();
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }

    @Override
    public void withdraw(double amount){
        balance-=amount;
    }
}
