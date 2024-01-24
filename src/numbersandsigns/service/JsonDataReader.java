package service;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class JsonDataReader {
    public JsonDataReader() {
    }



    public static void modelDataJsonReader(String pathToJson) {

        ObjectMapper objectMapper = new ObjectMapper();

      //  try {
                    //ArrayList data = objectMapper.readValue(new File(pathToJson) );
                    System.out.println("Hjjjjjjjjjjjjjjj");
      /*  } catch(StreamReadException ex){
            throw new RuntimeException(ex);
        } catch(DatabindException ex){
            throw new RuntimeException(ex);
        } catch(IOException ex){
            throw new RuntimeException(ex);
        }*/
    }

}
