package streams;

import lombok.Builder;
import lombok.Value;

import java.util.ArrayList;
import java.util.List;

public class EachTest {
    public static void main(String[] args) {
        int[] numbers = {-1, 2, 0, -3, 8};
        List<Integer> numberList = new ArrayList<>();

        for(int n: numbers) {
            numberList.add(n);
        }

        // void forEach(Consumer<T>)
        // forEach メソッドは Consumer を引数に取り、要素の数だけ処理を繰り返す
        numberList.stream().forEach((i) -> { System.out.println(i);});

        DiscountOffer d = DiscountOffer.builder().id(1).name("abc").count(1).build();
    }
}

@Builder
@Value
class DiscountOffer {
    private int id;
    private String name;
    private int count;
}
