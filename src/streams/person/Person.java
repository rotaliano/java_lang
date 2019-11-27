package streams.person;

import lombok.Builder;
import lombok.Data;
import lombok.Value;

/**
 * DBのモデルの代わり
 */
@Value
@Builder
class Person {
    private String name;
    private int age;
    private int gender;
}
