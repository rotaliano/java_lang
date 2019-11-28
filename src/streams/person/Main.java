package streams.person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    private static List<Person> personList = new ArrayList<Person>() {{
        add(Person.builder().name("りゅうじょう").age(20).gender(1).build());
        add(Person.builder().name("こんごう").age(10).gender(2).build());
        add(Person.builder().name("やましろ").age(120).gender(3).build());
    }};

    public static void main(String[] args) {
        List<PersonDto> personDtoList = personList.stream() // Stream<Person>
                // 複数の処理を行わないのであれば1ラインでreturnが不要
                // ラムダ式の引数をそのまま何もせずにメソッドの入力する場合
                .map(PersonDto::create) // Stream<PersonDto>
                .collect(Collectors.toList()); // List<PersonDto>

        personDtoList.stream().forEach(System.out::println);
    }
}
