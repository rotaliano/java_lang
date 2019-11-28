package lombok;

import lombok.Data;

@Value
@Builder
class Person {
    private int age;
    private String name;
}
