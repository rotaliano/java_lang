package guava;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;

public class MultimapTest {
    public static void main(String[] args) {
        LinkedHashMultimap<String, String> map = LinkedHashMultimap.create();
        map.put("key1", "value2");
        map.put("key1", "value1");
        System.out.println(map);
    }
}
