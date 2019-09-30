package optional;

import java.util.Optional;
import static java.lang.System.*;

public class OptionalTest {
    public static void main(String ...args) {
        Optional<String> opt = optionalFunction();
        // ifPresentはOptional型のオブジェクトを保つ場合のみ引数として渡されたラムダ式を実行します
        // 引数にとるラムダ式はConsumer型なので値を返すことはできません
        opt.ifPresent(value -> {
            out.println(value);
        });

        // mapはOptional型のオブジェクトが値を持つ場合のみその中身の値に対して引数として渡されたラムダ式を適用し
        // その結果得られた値をOptional型でラップして返却します
        Optional<String> mapped = opt.map(value2 -> {
            return "-" + value2;
        });
        out.print(mapped.orElse("default string"));
    }

    private static Optional<String> optionalFunction() {
        String abc = null;
        return Optional.ofNullable(abc);
    }
}
