package uuid;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UuidTest {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString();
        System.out.println(str);
        System.out.println(str.length());
    }
}
