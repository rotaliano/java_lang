package streams;

import java.util.stream.Stream;

public class OffsetLimitTest {
    public static void main(String[] args) {
        String stgr[] = {"a", "b", "c", "d", "e"};

        Stream.of(stgr)
                 .skip(0)
                 .limit(3)
                 .forEach(x -> System.out.println(x));
    }
}
