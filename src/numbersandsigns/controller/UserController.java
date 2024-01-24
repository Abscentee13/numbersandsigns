package controller;

import model.User;
import service.UserService;

import java.util.List;

public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Метод для створення нового користувача
    public void createUser(int id, String username, String firstName, String lastName, int age, String password, String email, String role) {
        User newUser = new User(id, username, firstName, lastName, age, password, email, role);
        userService.createUser(newUser);
        System.out.println("Користувач " + username + " успішно створений.");
    }

    // Метод для отримання списку всіх користувачів
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // Метод для отримання користувача за ідентифікатором
    public User getUserById(long userId) {
        return userService.getUserById(userId);
    }

    // Метод для оновлення інформації про користувача
    public void updateUser(long userId, String newFirstName, String newLastName, int newAge, String newPassword, String newEmail) {
        User userToUpdate = userService.getUserById(userId);
        if (userToUpdate != null) {
            userToUpdate.setFirstName(newFirstName);
            userToUpdate.setLastName(newLastName);
            userToUpdate.setAge(newAge);
            userToUpdate.setPassword(newPassword);
            userToUpdate.setEmail(newEmail);
            userService.updateUser(userToUpdate);
            System.out.println("Інформацію про користувача " + userId + " успішно оновлено.");
        } else {
            System.out.println("Користувача з ідентифікатором " + userId + " не знайдено.");
        }
    }

    // Метод для видалення користувача за ідентифікатором
    public void deleteUser(long userId) {
        if (userService.deleteUser(userId)) {
            System.out.println("Користувача " + userId + " успішно видалено.");
        } else {
            System.out.println("Користувача з ідентифікатором " + userId + " не знайдено.");
        }
    }
}