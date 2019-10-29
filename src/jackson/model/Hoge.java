package jackson.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Hoge {
    private int id;

    @JsonIgnore
    private String name;

//    @Data
//    @NoArgsConstructor
//    @AllArgsConstructor
//    @Builder
//    static class staticHoge {
//        private int id_2;
//        private String name_2;
//    }
}
