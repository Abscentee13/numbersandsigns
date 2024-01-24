package service;

import model.User;
import view.UserInputHandler;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private final List<User> users;

    public UserService() {
        this.users = new ArrayList<>();
    }

    // Метод для створення нового користувача
    public void createUser(User user) {
        users.add(user);
    }

    public void createUserWithInput() {
        UserInputHandler userInputHandler = new UserInputHandler();
        String username = userInputHandler.promptUserForString("Введіть ім'я користувача");
        int age = userInputHandler.promptUserForInteger("Введіть вік користувача");

        // Логіка створення користувача з отриманими від користувача даними
    }

    // Метод для отримання списку всіх користувачів
    public List<User> getAllUsers() {
        return new ArrayList<>(users);
    }

    // Метод для отримання користувача за ідентифікатором
    public User getUserById(long userId) {
        for (User user : users) {
            if (user.getId() == userId) {
                return user;
            }
        }
        return null;
    }

    // Метод для оновлення інформації про користувача
    public void updateUser(User updatedUser) {
        for (User user : users) {
            if (user.getId() == updatedUser.getId()) {
                // Оновлення інформації про користувача
                user.setFirstName(updatedUser.getFirstName());
                user.setLastName(updatedUser.getLastName());
                user.setAge(updatedUser.getAge());
                user.setPassword(updatedUser.getPassword());
                user.setEmail(updatedUser.getEmail());
                break;
            }
        }
    }

    // Метод для видалення користувача за ідентифікатором
    public boolean deleteUser(long userId) {
        for (User user : users) {
            if (user.getId() == userId) {
                users.remove(user);
                return true;
            }
        }
        return false;
    }
}
