package service;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class JsonDataReader {
    public JsonDataReader() {
    }


//////зробити повернення List
    public static void modelDataJsonReader(String pathToJson, Class dataClass) {

        ObjectMapper objectMapper = new ObjectMapper();


            //User[] users = new User[]{objectMapper.readValue(new File(pathToJson), User.class)};

            if (dataClass.equals(User.class)) {
                try {
                    User[] users = objectMapper.readValue(new File(pathToJson), new TypeReference<User[]>() {
                });
                for (User user: users)
                {
                    user.displayUserInfo();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("user data");


            }


////////ПЕРЕРОБИТИ!!!!!!!!!!!
////////ПЕРЕРОБИТИ!!!!!!!!!!!
        if (dataClass.equals(Tag.class)) {
            try {
                Tag[] tags = objectMapper.readValue(new File(pathToJson), new TypeReference<Tag[]>() {
                });
                for (Tag tag: tags)
                {
                    tag.displayTag();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Tag data");


        }


    }

}
