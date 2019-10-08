package generics;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
class ClassGenerics<T> {
    private T t;
}

public class ClassSample {
    public static void main(String[] args) {
        // Stringとして利用
        ClassGenerics<String> cs1 = new ClassGenerics<>("Hello");
        String str = cs1.getT();
        System.out.println(str);

        // Integerとして利用
        ClassGenerics<Integer> cs2 = new ClassGenerics<>(1);
        Integer i = cs2.getT();
        System.out.println(i);

        // ワイルドカードを使用、Number型として利用可能
        ClassGenerics<? extends Number> cs3;
        // Number = Integer
        cs3 = cs2;
        Number n = cs3.getT();
        System.out.println(n);

        ClassGenerics<Number> cs4 = new ClassGenerics<>(2);
        ClassGenerics<? super Integer> cs5;
        // Integer = Number
        cs5 = cs4;
        Object o = cs5.getT();
        System.out.println(o);

    }
}
