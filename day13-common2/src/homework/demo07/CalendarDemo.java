package homework.demo07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Date:2021/1/25 19:21
 * Author:lyf
 */
public class CalendarDemo {
    public static void main(String[] args) throws ParseException {
        //查询某个时间最近一周的消息，如何表示最近这一周的开始时间和结束时间；
        String time = "2021-1-25 20:35:21";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = simpleDateFormat.parse(time);
        System.out.println(parse);


        Calendar calendar = Calendar.getInstance();
        calendar.setTime(parse);
        calendar.set(Calendar.DAY_OF_MONTH,25);
        calendar.set(Calendar.HOUR_OF_DAY,23);
        calendar.set(Calendar.MINUTE,59);
        calendar.set(Calendar.SECOND,59);
        System.out.println(calendar.getTime());

        calendar.set(Calendar.DAY_OF_MONTH,calendar.get(Calendar.DAY_OF_MONTH)-7);
        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        System.out.println(calendar.getTime());

    }
}
