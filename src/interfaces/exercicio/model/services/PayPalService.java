package interfaces.exercicio.model.services;

public class PayPalService implements OnlinePaymentService {

    @Override
    public double paymentFree(double amount) {
        return amount * 0.02;
    }

    @Override
    public double interest(double amount, int months) {
        return  amount * 0.01 * months;
    }
}
