package interfaces.exercicio.model.services;

import interfaces.exercicio.model.entities.Contract;
import interfaces.exercicio.model.entities.Installments;
import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months){
        double basicQuota = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interest = onlinePaymentService.interest(basicQuota,i);
            double fee = onlinePaymentService.paymentFree(basicQuota + interest);
            double quota = basicQuota + interest + fee;
            contract.getInstallments().add(new Installments(dueDate,quota));
        }

    }
}
