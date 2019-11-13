package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

// コレクション、配列、MapをStreamクラスに変換
public class StreamofTest {
    public static void main(String[] args) {
        // コレクション
        List<String> list = new ArrayList<>();
        Stream<String> listStream = list.stream();

        // 配列
        String[] ary = {"AA", "BB", "CC", "DD"};
        Stream<String> arrStream1 = Arrays.stream(ary);
        Stream<String> aryStream2 = Stream.of(ary);
        Stream<String> aryStream3 = Stream.of("a","b");

        // Map
        Map<String, String> map = new HashMap<>();
        Stream<Map.Entry<String, String>> mapStream = map.entrySet().stream();
    }
}
