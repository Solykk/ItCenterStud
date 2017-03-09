package hw9.taxi.exception;

/**
 * Created by Solyk on 01.03.2016.
 */
public class AuthenticationException extends Exception {

    private String message;

    public AuthenticationException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
