package lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaTest {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("a", "b", "c", "d");
        str.forEach(System.out::println);
    }
}
