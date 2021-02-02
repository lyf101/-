package homework.demo001;

/**
 * Date:2021/2/2 10:14
 * Author:lyf
 */
public class HighSalaryException extends Exception {
    public HighSalaryException(String message) {
        super(message);
    }

    public HighSalaryException(String message, Throwable cause) {
        super(message, cause);
    }
}
