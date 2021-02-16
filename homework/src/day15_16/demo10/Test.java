package day15_16.demo10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date:2021/2/16 12:53
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) throws ParseException {
        String s = "2021-02-15";
        SimpleDateFormat sdf  = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse(s);
        System.out.println(parse.toString());
    }
}
