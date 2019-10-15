package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.function.IntToDoubleFunction;

public class LambdaTest {
    public static void main(String[] args) {
        // ( 型 引数名1, 引数名2, ...) -> {
            // 処理1
            // 処理2
            // return 戻り値;
        // }
        IntBinaryOperator func = (int a, int b) -> { return a - b; };
        int a = func.applyAsInt(5, 3);
        System.out.println(a);

        double b = 1.41;
        IntToDoubleFunction func2 = (x) -> {
            return x * x * b;
        };
        System.out.println(func.applyAsInt(2, 3));

        List<String> str = Arrays.asList("a", "b", "c", "d");
        str.forEach(System.out::println);
    }
}
class Example {
    // (Hero h) -> { return h.getHp(); }
    // () -> { return new java.util.Date(); }
}