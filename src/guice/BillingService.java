package guice;

import com.google.inject.Inject;
import lombok.AllArgsConstructor;

@AllArgsConstructor(onConstructor = @__({@Inject}))
public class BillingService {
    private final CreditCardProcessor processor;
    private final TransactionLog transactionLog;
    private final ResourceMapper rm;

//    @Inject
//    public BillingService(CreditCardProcessor processor, TransactionLog transactionLog) {
//        this.processor = processor;
//        this.transactionLog = transactionLog;
//    }

    public Receipt changeOrder(PizzaOrder order, CreditCard creditCard) {
        System.out.println("new Receipt");
        return new Receipt();
    }
}
