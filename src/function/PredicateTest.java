package function;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        // Predicate<T> の T はメソッドの引数の方
        // メソッドは boolean test(T)
        Predicate<String> checker = (s) -> { return s.equals("java");};
        boolean result = checker.test("java");
        System.out.println(result);
    }
}
