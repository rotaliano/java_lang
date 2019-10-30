package guice.named;

import com.google.inject.AbstractModule;
import com.google.inject.TypeLiteral;
import com.google.inject.name.Names;

import java.util.Arrays;
import java.util.List;

public class SampleModule extends AbstractModule {

    @Override
    protected void configure() {
        // 紐付けしたいデータ
        List<String> targetList = Arrays.asList("data1", "data2", "data3");

        bind(new TypeLiteral<List<String>>() {})
                .annotatedWith(Names.named("sample.list")).toInstance(targetList);
    }
}
