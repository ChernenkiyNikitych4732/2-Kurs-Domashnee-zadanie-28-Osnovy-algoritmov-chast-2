package exceptions;

public class ListIndexNotFoundException extends RuntimeException {
    public ListIndexNotFoundException(String message) {
        super(message);
    }
}