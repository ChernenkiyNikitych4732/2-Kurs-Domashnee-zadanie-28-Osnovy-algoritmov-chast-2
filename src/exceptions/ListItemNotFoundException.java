package exceptions;

public class ListItemNotFoundException extends RuntimeException {
    public ListItemNotFoundException(String message) {
        super(message);
    }
}