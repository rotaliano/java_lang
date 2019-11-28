package streams.person;

import lombok.Builder;
import lombok.Value;

import java.util.function.Function;

/**
 * アプリ側で利用するデータの形
 */
@Builder
@Value
public class PersonDto {

    public String name;
    private Gender gender;
    private AgeRange ageRange;

    static PersonDto create(Person person) {
        return builder()
                .name(person.getName())
                .gender(toGender.apply(person.getGender()))
                .ageRange(toAgeRange.apply(person.getAge()))
                .build();
    }

    public static Function<Integer, Gender> toGender = (x) -> {
        switch (x) {
            case 1: return Gender.MALE;
            case 2: return Gender.FEMALE;
            default: return Gender.OTHER;
        }
    };

    public static Function<Integer, AgeRange> toAgeRange = (x) -> {
        if (x < 20) {
            return AgeRange.YOUNG;
        } else if (x < 50) {
            return AgeRange.MIDDLE;
        } else {
            return AgeRange.OLD;
        }
    };

}
