package numbersandsigns;

import model.*;
import service.JsonDataReader;
import view.CustomerConsoleUI;
import view.Menu;
import view.UserConsoleUI;

public class Application {

    public static User[] users;

    //поточний юзер
    public static User currentUser = new User(0, "", "", "", 18, "", "", "Гість");

    public static void runner() throws IllegalAccessException {

        users = JsonDataReader.modelDataJsonReader(Path.USER_JSON.getPath(), User[].class );

        if (users.length != 0) {
            for (User user : users) {
                UserConsoleUI.displayUserInfo(user);
                CustomerConsoleUI.printLine('-', 35);
            }
        }
        else {
            CustomerConsoleUI.printTitle("HO DATA");
        }

        Menu.show();
    }

        public static void main(String[] args) throws IllegalAccessException {
            System.out.println("Цифри та символи");
            runner();
        }
}
