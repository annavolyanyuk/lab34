package exceptions;

public class NoSpaceError extends RuntimeException{
    public NoSpaceError(String message) {
        super(message);
    }
}
