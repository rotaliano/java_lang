package optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Integer value = IntegerList.get(2);
        if (value == null) {
            value = -1;
        }
        value += 100;
        System.out.println("結果:" + value);

        Integer value2 = Optional.ofNullable(IntegerList.get(2)).orElse(-1);
        value2 += 100;
        System.out.println("結果:" + value2);

        Optional<Integer> optionalInteger = IntegerList.getUseOptional(2);
        Integer value3 = optionalInteger.orElse(-1) + 100;
        System.out.println("結果:" + value3);
    }
}
