package guava;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


/**
 * https://www.codeflow.site/ja/article/guava-cache
 */
public class GuavaTest {
    @Test
    public void whenCacheMiss__thenValueIsComputed() {
        CacheLoader<String, String> loader;
        loader = new CacheLoader<String, String>() {
            @Override
            public String load(String key) {
                return key.toUpperCase();
            }
        };
        LoadingCache<String, String> cache;
        cache = CacheBuilder.newBuilder().build(loader);

        assertEquals(0, cache.size());
        assertEquals("HELLO", cache.getUnchecked("hello")); // まだ存在していない場合は、これが計算されてキャッシュにロードされます。
        assertEquals(1, cache.size());
    }
}
