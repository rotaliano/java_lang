package jackson;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import jackson.model.Hoge;

import java.io.IOException;

public class JacksonToStringTest {

    public static void main(String[] args) throws IOException {

        Hoge hoge = Hoge.builder().id(12).name("名前").build();

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        String json = mapper.writeValueAsString(hoge);

        System.out.println(json);
    }
}
