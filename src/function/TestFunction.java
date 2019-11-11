package function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class TestFunction {
    public static void main(String[] args) {
        // T は引数、R は戻り値
        Function<Integer, String> asterisker = (i) -> {return "*" + i;};
        String result = asterisker.apply(10);
        System.out.println(result);

        // 2つの引数を受け付ける BiFuntion インターフェース
        BiFunction<Integer, Integer, Integer> adder = (a, b) -> { return a + b;};
        int result2 = adder.apply(1, 2);
        System.out.println(result2);
    }
}
