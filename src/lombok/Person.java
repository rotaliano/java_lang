package lombok;

import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private int age;
    private String name;
}
