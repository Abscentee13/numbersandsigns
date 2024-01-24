import model.User;
import service.JsonDataReader;

public class Application {


    public static void runner() {
        JsonDataReader.modelDataJsonReader("src//numbersandsigns//repository//UserData.json", User.class);
    }


        public static void main(String[] args) {

            System.out.println("Цифри та символи");
            runner();
        }
}
