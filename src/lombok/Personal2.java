package lombok;

import lombok.experimental.Wither;

@Wither
@Value
@AllArgsConstructor
public class Personal2 {
    private long id;
    private String name;
    private int age;
}
