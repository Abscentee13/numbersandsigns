package service;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.User;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class JsonDataReader {
    public JsonDataReader() {
    }



    public static void modelDataJsonReader(String pathToJson, Class dataClass) {

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            //User[] users = new User[]{objectMapper.readValue(new File(pathToJson), User.class)};

            User[] users = objectMapper.readValue(new File(pathToJson), new TypeReference<User[]>() {});


            for (User user: users)
                    {
                        user.displayUserInfo();
                    }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("user data");
    }

}
