package view;

import java.util.Scanner;

public class UserInputHandler {
    private Scanner scanner;

    public UserInputHandler() {
        this.scanner = new Scanner(System.in);
    }

    // Метод для отримання рядка від користувача
    public String promptUserForString(String prompt) {
        System.out.print(prompt + ": ");
        return scanner.nextLine();
    }

    // Метод для отримання цілочисельного значення від користувача
    public int promptUserForInteger(String prompt) {
        System.out.print(prompt + ": ");
        while (!scanner.hasNextInt()) {
            System.out.println("Будь ласка, введіть ціле число.");
            System.out.print(prompt + ": ");
            scanner.next(); // Очистка буфера введення
        }
        int result = scanner.nextInt();
        scanner.nextLine(); // Очистка рядка введення
        return result;
    }

    // Інші методи опитування користувача можна додати за необхідності

    // Закриття Scanner при завершенні використання
    public void closeScanner() {
        scanner.close();
    }
}
