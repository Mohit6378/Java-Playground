class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class Exception10 {
    public static void validateAge(int age) throws MyCustomException {
        if (age < 18) {
            throw new MyCustomException("Age must be 18 or above.");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(16);
        } catch (MyCustomException e) {
            System.out.println("Validation failed: " + e.getMessage());
        }
    }
}