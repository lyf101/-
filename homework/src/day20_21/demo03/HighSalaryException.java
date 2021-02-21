package day20_21.demo03;

/**
 * Date:2021/2/21 9:54
 * Author:lyf
 */
public class HighSalaryException extends RuntimeException {
    public HighSalaryException(String message, Throwable cause) {
        super(message, cause);
    }

    public HighSalaryException(String message) {
        super(message);
    }
}
