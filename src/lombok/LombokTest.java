package lombok;

@Value
public class LombokTest {
    @NonNull
    private String str;
    public static void main(String[] args) {
        Person p = Person.builder()
              .age(20)
              .name("Tuyoshi")
              .build();

        System.out.println("age:" + p.getAge());
        System.out.println("name:" + p.getName());
        System.out.println("name:" + p);

        try {
            new LombokTest(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
