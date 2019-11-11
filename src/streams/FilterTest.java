package streams;

import java.util.ArrayList;
import java.util.List;

public class FilterTest {
    public static void main(String[] args) {
        int[] numbers = {-1, 2, 0, -3, 8};
        List<Integer> numberList = new ArrayList<>();

        for(int n: numbers) {
            numberList.add(n);
        }

        // Stream filter(Predicate<T>)
        // filter メソッドは Predicate を引数に取り、条件に合致しないものを除いた Stream を返す
        numberList.stream().filter((i) -> { return 0 < i;})
                  .forEach(System.out::println);
    }
}
