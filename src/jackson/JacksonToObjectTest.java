package jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

public class JacksonToObjectTest {
    public static void main(String[] args) throws JsonProcessingException {
        String json = "{\"id\":20, \"name\":\"HOGE\"}";

        ObjectMapper mapper = new ObjectMapper();
        Hoge hoge = mapper.readValue(json, Hoge.class);

        System.out.println(hoge);
    }
}

