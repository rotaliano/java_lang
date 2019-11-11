package streams;

import java.util.ArrayList;
import java.util.List;

public class MapTest {
    public static void main(String[] args) {
        int[] numbers = {-1, 2, 0, -3, 8};
        List<Integer> numberList = new ArrayList<>();

        for(int n: numbers) {
            numberList.add(n);
        }

        // Stream map(Function<T,R>)
        // map メソッドは Function を引数に取り、処理後の結果を Stream にして返します。
        // filter と同じく中間操作
        numberList.stream().filter((i) -> { return 0 <= i;})
                  .map((i) -> { return "*" + i + "*";})
                  .forEach(System.out::println);
    }
}
