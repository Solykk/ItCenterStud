package hw9.taxi.exception;

/**
 * Created by Solyk on 02.03.2016.
 */
public class OrderException extends Exception {

    private String message;

    public OrderException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
