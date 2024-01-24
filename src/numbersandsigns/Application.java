import model.*;
import service.JsonDataReader;
import view.Menu;

public class Application {


    public static void runner() {


        JsonDataReader.modelDataJsonReader("src//numbersandsigns//repository//UserData.json", User.class);
        JsonDataReader.modelDataJsonReader("src//numbersandsigns//repository//TagData.json", Tag.class);

        Menu.show();
    }


        public static void main(String[] args) {

            System.out.println("Цифри та символи");
            runner();

        }
}
