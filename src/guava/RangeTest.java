package guava;

import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;

import java.time.LocalDate;
import java.time.MonthDay;

public class RangeTest {
    public static void main(String[] args) {
        Range<MonthDay> summerVecation = Range.closed(MonthDay.of(7, 21), MonthDay.of(8, 31));
        if (!summerVecation.contains(MonthDay.of(9, 1))) {
            System.out.println("夏休み終わり");
        }
    }
}
