package homework.demo05;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date:2021/1/25 19:03
 * Author:lyf
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println(format);
    }
}
