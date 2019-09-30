package optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class IntegerList {
    private final static List<Integer> INTEGER_LIST = Arrays.asList(new Integer[]{1,2,null});

    public static Integer get(int index) {
        return INTEGER_LIST.get(index);
    }

    // 戻り値にnullが含まれている可能性があるためOptionalでラップして返却する
    public static Optional<Integer> getUseOptional(int index) {
        return Optional.ofNullable(IntegerList.get(index));
    }
}
