package model;


public class ValidationException extends Exception {
    private final ValidationError validationError;

    public ValidationException(ValidationError validationError) {
        this.validationError = validationError;
    }

    public ValidationError getValidationError() {
        return validationError;
    }

    public String getErrorMessage() {
        return validationError.getMessage();
    }
}
