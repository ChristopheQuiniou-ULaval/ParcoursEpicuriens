package cgrc.parcoursepicuriens.api;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class JsonParser {

    static String parse(Object obj) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
    }

}
