package homework.demo04;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date:2021/1/25 18:59
 * Author:lyf
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) {

        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);



        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(date);
        System.out.println(format);

    }
}
