package guice.named;

import static com.google.common.collect.Lists.newArrayList;

import com.google.common.collect.Lists;
import com.google.inject.Inject;

import java.util.List;

import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
public class SampleList {

    private final List<String> list = newArrayList();

    /**
     * コンストラクタで @Named で sample.list という値を指定して List<String> の値を受け取るようにしてます
     */
    @Inject
    public SampleList(@Named("sample.list") List<String> srcList) {
        list.addAll(srcList);
    }

    public List<String> list() {
        return list;
    }
}
