package optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import static java.util.Optional.ofNullable;

public final class IntegerList {

    private static final List<Integer> INTEGER_LIST = Arrays.asList(new Integer[]{1,2,null});
    private static final Boolean enabled = new Boolean(true);

    static Integer get(int index) {
        return INTEGER_LIST.get(index);
    }

    // 戻り値にnullが含まれている可能性があるためOptionalでラップして返却する
    static Optional<Integer> getUseOptional(int index) {
        return ofNullable(IntegerList.get(index));
    }

    static Optional<Boolean> getEnable() {
        return ofNullable(enabled);
    }
}
