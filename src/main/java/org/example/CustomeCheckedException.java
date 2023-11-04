package org.example;

class CheckedException extends Exception {
    public CheckedException() {
        super();
    }

    public CheckedException(String str) {
        super(str);
    }

    public CheckedException(String message, Throwable cause) {
        super(message, cause);
    }

    public CheckedException(Throwable cause) {
        super(cause);
    }
}

public class CustomeCheckedException {
    public static void main(String[] args) {
        try {
            performOperation();
        } catch (CheckedException e) {
            System.err.println("Caught custom exception" + e.getMessage());
        }
    }

    public static void performOperation() throws CheckedException {
        // throw new CheckedException("THis is checked excpetion");
        System.out.println("Hi ");
    }
}
