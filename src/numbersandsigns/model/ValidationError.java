package model;

public enum ValidationError {
    EMPTY_USERNAME("Ім'я користувача не може бути порожнім."),
    INVALID_EMAIL("Невірний формат електронної пошти."),
    WEAK_PASSWORD("Пароль повинен містити принаймні 8 символів і включати букви та цифри."),
    USERNAME_TAKEN("Це ім'я користувача вже зайняте."),
    ;

    private final String message;

    ValidationError(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
