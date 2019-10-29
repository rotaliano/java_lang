package jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jackson.model.Hoge;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class JacksonToObjectTest {
    public static void main(String[] args) throws JsonProcessingException {
        String json = "[{\"id\":15, \"name\":\"hoge\"}, {\"id\":16, \"name\":\"fuga\"}]";

        ObjectMapper mapper = new ObjectMapper();

        List<Hoge> list = mapper.readValue(json, new TypeReference<List<Hoge>>() {});

        System.out.println(list);
    }
}

