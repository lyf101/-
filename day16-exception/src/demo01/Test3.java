package demo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date:2021/1/31 15:49
 * Author:lyf
 */
public class Test3 {
    public static void main(String[] args) {

        try {
            parseDate("abc");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static Date parseDate(String dateStr) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat();
        return df.parse(dateStr);
    }
}
