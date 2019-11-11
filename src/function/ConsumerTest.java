package function;

import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        // Consumer<T> は T はメソッドの引数の方を指定
        // メソッドは void accept(T)
        Consumer<String> buyer = (goods) -> { System.out.println(goods + "を購入しました");};
        buyer.accept("おにぎり");
    }
}
