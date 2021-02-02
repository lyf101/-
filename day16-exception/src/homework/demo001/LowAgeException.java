package homework.demo001;

/**
 * Date:2021/2/2 10:08
 * Author:lyf
 */
public class LowAgeException extends Exception {
    public LowAgeException(String message) {
        super(message);
    }

    public LowAgeException(String message, Throwable cause) {
        super(message, cause);
    }
}
