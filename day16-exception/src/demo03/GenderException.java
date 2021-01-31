package demo03;

/**
 * Date:2021/1/31 16:48
 * Author:lyf
 */
public class GenderException extends Exception{

    public GenderException() {
    }

    public GenderException(String message) {
        super(message);
    }

    public void log(){
        System.out.println("日志");
    }
}
