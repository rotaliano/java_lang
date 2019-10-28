package jackson;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.IOException;

public class JacksonToStringTest {
    public static void main(String[] args) throws IOException {
        Hoge hoge;
        hoge = Hoge.builder().id(12).name("名前").build();

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(hoge);

        System.out.println(json);
    }
}
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
class Hoge {
    private int id;
    private String name;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    static class staticHoge {
        private int id_2;
        private String name_2;
    }
}