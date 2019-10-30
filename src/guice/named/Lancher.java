package guice.named;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Lancher {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new SampleModule());

        SampleList sampleList = injector.getInstance(SampleList.class);

        System.out.println("SampleList#list -> " + sampleList.list());
        System.out.println(String.format("User %s in not allowed to disable filter-by-user",123));
    }
}
