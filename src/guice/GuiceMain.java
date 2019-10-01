package guice;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceMain {
    public static void main(String[] args) {
        /*
         * Guice.createInjector（）はモジュールを受け取り、新しいインジェクターインスタンスを返します
         * ほとんどのアプリケーションは、main()でこのメソッドを1回だけ呼び出します。
         */
        Injector injector = Guice.createInjector(new BillingModule());
        /*
         * インジェクターができたので、オブジェクトを作成できます。
         */
        BillingService billingService = injector.getInstance(BillingService.class);
        billingService.changeOrder(new PizzaOrder(), new CreditCard());
    }
}
