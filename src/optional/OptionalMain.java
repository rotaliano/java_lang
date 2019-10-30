package optional;

import java.util.Optional;
import static java.lang.System.*;
import static optional.IntegerList.*;

public class OptionalMain {
    public static void main(String[] args) {
        Integer value = get(2);
        if (value == null) {
            value = -1;
        }
        value += 100;
        System.out.println("結果:" + value);

        Integer value2 = Optional.ofNullable(get(2)).orElse(-1);
        value2 += 100;
        System.out.println("結果:" + value2);

        Optional<Integer> optionalInteger = getUseOptional(2);
        Integer value3 = optionalInteger.orElse(-1) + 100;
        System.out.println("結果:" + value3);

        Optional<String> empty = Optional.empty();
        out.println(empty.isPresent()); // false
        out.println(empty.orElse("other")); // other
        //out.println(empty.get()); // NoSuchElementException

        // of
        String str = "nonNull";
        Optional<String> nonNullString = Optional.of(str);
        out.println(nonNullString.isPresent()); // true
        out.println(nonNullString.get()); // nonNull

        String strNull = null;
        //Optional.of(strNull); // NullPointerException

        Optional<Boolean> enable = getEnable();
        out.println(enable.orElse(false));
    }
}
