package lombok;

import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person {
    private int age;
    private String name;
}
