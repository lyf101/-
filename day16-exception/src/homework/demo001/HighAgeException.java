package homework.demo001;

/**
 * Date:2021/2/2 10:14
 * Author:lyf
 */
public class HighAgeException extends Exception{
    public HighAgeException(String message) {
        super(message);
    }

    public HighAgeException(String message, Throwable cause) {
        super(message, cause);
    }
}
