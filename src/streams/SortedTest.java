package streams;

import java.util.ArrayList;
import java.util.List;

public class SortedTest {
    public static void main(String[] args) {
        int[] numbers = {-1, 2, 0, -3, 8};
        List<Integer> numberList = new ArrayList<>();

        for(int n: numbers) {
            numberList.add(n);
        }

        // Stream sorted(Comparator<T>)
        // Comparator を引数に取る sorted メソッドも用意されている
        // filter と同じく中間処理
        numberList.stream().filter((i) -> { return 0 <= i; })
                  .sorted((i1, i2) -> { return i1 - i2; })
                  .map((m) -> { return "*" + m +"*"; })
                  .forEach((e) -> { System.out.println(e); });
    }
}
