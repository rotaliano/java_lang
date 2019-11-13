package enumm;

import lombok.Getter;

public class EnumTest {
    public static void main(String[] args) {
        for(Fruit fruit : Fruit.values()) {
            System.out.println(fruit.ordinal() + ":" + fruit.name() + "," + fruit.getName());
        }
    }

    protected enum Fruit {
        ORANGE("Ehime"),
        APPLE("Aomori"),
        MELON("Ibaraki");

        @Getter
        private final String name;

        Fruit(String name) {
            this.name = name;
        }
    }
}
