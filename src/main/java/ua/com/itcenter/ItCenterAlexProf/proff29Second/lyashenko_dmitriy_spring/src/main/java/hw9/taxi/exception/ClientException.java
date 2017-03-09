package hw9.taxi.exception;

/**
 * Created by Solyk on 03.03.2016.
 */
public class ClientException extends Exception {

    private String message;

    public ClientException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
