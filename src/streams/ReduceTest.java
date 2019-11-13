package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

/**
 * Stream.reduce
 */
public class ReduceTest {
    public static void main(String[] args) {
        final List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        // パラメータが1つ
        final Optional<String> result = list.stream().reduce(
                (acceum, value) -> {
                    return acceum + "-" + value;
                });
        System.out.println(result.orElse(""));

        // パラメータが2つ
        final BinaryOperator<String> operation = (accum, value) -> {
            return accum + "-" + value;
        };
        final String result1 = list.stream().reduce("value", operation);
        final String result2 = new ArrayList<String>().stream().reduce("value", operation);

        System.out.println(result1);
        System.out.println(result2);
    }
}
