package lombok;

public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(20);
        p.setName("Tuyoshi");

        System.out.println("age:" + p.getAge());
        System.out.println("name:" + p.getName());
        System.out.println("name:" + p);
    }
}
