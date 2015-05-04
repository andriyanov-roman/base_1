package exception;

/**
 * Created by Администратор on 04.05.2015.
 */
public class SomethingWrongException extends Exception {
    public SomethingWrongException() {
        super();
    }

    public SomethingWrongException(String message) {
        super(message);
    }

    public SomethingWrongException(String message, Throwable cause) {
        super(message, cause);
    }

    public SomethingWrongException(Throwable cause) {
        super(cause);
    }

    protected SomethingWrongException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
