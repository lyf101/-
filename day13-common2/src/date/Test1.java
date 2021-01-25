package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date:2021/1/25 16:38
 * Author:lyf
 */
public class Test1 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.getTime());

        System.out.println(date.getTime());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(date);
        System.out.println(format);

        String str = "2021-01-25 16:56:15";
        Date parse = null;
        try {
            parse = sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(parse.getTime());
    }
}
