package lombok;

public class LombokTest {
    public static void main(String[] args) {
        Person p = Person.builder()
              .age(20)
              .name("Tuyoshi")
              .build();

        System.out.println("age:" + p.getAge());
        System.out.println("name:" + p.getName());
        System.out.println("name:" + p);
    }
}
