package guice;

import com.google.inject.AbstractModule;

public class BillingModule extends AbstractModule {
    @Override
    protected void configure() {
        /*
         * これにより、GuiceにTransactionLogの依存関係が見つかった場合は、
         * DatabaseTransactionLogを使用して依存関係を満たす必要があることがわかります。
         */
        bind(TransactionLog.class).to(DatabaseTransactionLog.class);
        /*
         * 同様に、このバインディングはGuiceに、CreditCardProcessorが依存関係で使用される場合
         * PaypalCreditCardProcessorで満たされる必要があることを伝えます。
         */
        bind(CreditCardProcessor.class).to(PaypalCreditCardProcessor.class);

        bind(ResourceMapper.class);
    }
}
