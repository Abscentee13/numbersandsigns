package service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class JsonDataReader {
    public JsonDataReader() {
    }


//////зробити повернення List
public static <T> T modelDataJsonReader(String pathToJson, Class<T> clazz) {
    ObjectMapper objectMapper = new ObjectMapper();

    try {
        return objectMapper.readValue(new File(pathToJson), clazz);
    } catch (IOException ex) {
        throw new RuntimeException(ex);
    }
}

}


