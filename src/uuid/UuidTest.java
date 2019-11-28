package uuid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class UuidTest {
    public static void main(String[] args) {
        List<UUID> uuids = new ArrayList<>();
        for (int i = 0; i <10; i++) {
            uuids.add(UUID.randomUUID());
        }

        uuids.stream().forEach(x -> {
            System.out.println(x);
            System.out.println(x.toString().length());
        });
    }
}
