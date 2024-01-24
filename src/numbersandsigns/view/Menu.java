package view;

import numbersandsigns.Application;


public class Menu {
    public Menu() {
    }

    public static void show() throws IllegalAccessException {
        //while (true) {
        CustomerConsoleUI.printLine('*', 20);
            CustomerConsoleUI.printTitle ("MENU");
        CustomerConsoleUI.printLine('*', 20);
       // }



        while (true) {
            if (Application.currentUser.getRole().equals("Гість") || Application.currentUser.getRole().equals("")){
                CustomerConsoleUI.printMenu("1 Авторизація");
            }
            else {
                CustomerConsoleUI.printMenu("1 Вийти із системи");
                CustomerConsoleUI.printMenu("2 Переглянути свої дані");
                CustomerConsoleUI.printMenu("3 Переглянути завдання");
                CustomerConsoleUI.printMenu("4 Знайти завдання за тегом");
                CustomerConsoleUI.printMenu("5 Додати завдання");

            }
            if (Application.currentUser.equals("Адміністратор")){
                CustomerConsoleUI.printMenu("6 Змінити користувача");
            }

            CustomerConsoleUI.printMenu("0 для виходу");



            int choice = new  UserInputHandler().promptUserForInteger("Ваш вибір"); // вибір користувача

            switch (choice) {
                case 1:
                    if (Application.currentUser.equals("")) {
                        // авторизація
                      //  AuthorizationService.authorization();
                    }
                    else {
                        //вихід з системи
                        Application.currentUser = null;
                    }
                    break;
                case 2:
                    //вивід персональних даних
                    if (Application.currentUser.getId() != 0) {
                       UserConsoleUI.displayUserInfo(Application.currentUser);
                    }
                    break;
                case 3:
                    //переглянути завдання

                    break;

                case 4:
                    //знайти завдання

                    break;

                case 5:
                    //Додати завдання

                    break;

                case 0:
                    // Вихід

                    CustomerConsoleUI.printTitle("Дякую, що скористалися нашою програмою.");
                    System.exit(0);
                    break;
                default:
                   CustomerConsoleUI.printSystemMessage("Невірний вибір. Спробуйте ще раз.");
                    break;
            }

            if (choice == 0) {break;}
        }

    }

}



