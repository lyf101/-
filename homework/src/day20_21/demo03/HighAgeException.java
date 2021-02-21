package day20_21.demo03;

/**
 * Date:2021/2/21 9:54
 * Author:lyf
 */
public class HighAgeException extends RuntimeException {
    public HighAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public HighAgeException(String message) {
        super(message);
    }
}
