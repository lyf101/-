package day20_21.demo03;

/**
 * Date:2021/2/21 9:54
 * Author:lyf
 */
public class LowAgeException extends RuntimeException {
    public LowAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public LowAgeException(String message) {
        super(message);
    }
}
