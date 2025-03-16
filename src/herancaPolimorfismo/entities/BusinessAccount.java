package herancaPolimorfismo.entities;

public class BusinessAccount extends Account{

    private double loanLimit;

    public BusinessAccount(){
        super();
    }

    public BusinessAccount(int number, String holder, double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    @Override
    public String toString() {
        return "BusinessAccount{" +
                "loanLimit=" + loanLimit +
                "} " + super.toString();
    }

    public void loan(double amount){
        if (amount <= loanLimit){
            balance += amount - 10.0;
        }
    }
}
