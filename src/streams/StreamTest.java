package streams;

import java.util.ArrayList;
import java.util.List;

/**
 * https://docs.oracle.com/javase/jp/8/docs/api/java/util/function/package-summary.html
 */
public class StreamTest {
    /**
     * java.util.Collectionを実装しているすべてのクラスは stream() メソッドを持つようになった
     */
    public static void main(String[] args) {
        int[] numbers = {-1, 2, 0, -3, 8};

        List<Integer> numberList = new ArrayList<>();

        for (int n : numbers) {
            numberList.add(n);
        }

        numberList.parallelStream().forEach((i) -> {
            System.out.println(i + " ");
        });

        System.out.println("filter");

        // filter
        numberList.stream().filter((i) -> { return i > 0; }) // 中間操作
                .forEach((i) -> { System.out.println(i + " "); // 終端操作
        });

        System.out.println("map");

        // map
        numberList.stream().filter((i) -> { return i >= 0;})
                .map((i) -> { return "*" + i + "*"; }) // 中間操作
                .forEach((s) -> { System.out.println(s + " "); });


    }
}
