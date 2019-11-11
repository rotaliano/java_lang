package function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        int[] numbers = {-1,2,0,-3,8};
        List<Integer> numberList = new ArrayList<>();

        for(int n : numbers) {
            numberList.add(n);
        }
        // 昇順(引数に処理を渡せる)
        Collections.sort(numberList, (a, b) -> { return a - b;});
        // 降順
        Collections.sort(numberList, (a, b) -> { return b - a;});
        for(int n : numberList) {
            System.out.println(n + " ");
        }
    }
}
