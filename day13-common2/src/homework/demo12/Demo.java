package homework.demo12;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date:2021/1/25 20:54
 * Author:lyf
 */
public class Demo {
    public static void main(String[] args) throws ParseException {
        String str = "name=小红&age=17&salary=8000.00&hireDate=1991-07-03;" +
                "name=小明&age=23&salary=10000.00&hireDate=1992-12-11;" +
                "name=小白&age=18&salary=12000.00&hireDate=1996-01-09";

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee[] employees = {employee1, employee2, employee3};
        String[] split1 = str.split(";");
        int i = 0;
        for (String s1 : split1) {
            String[] split2 = s1.split("&");
            for (String s2 : split2) {
                if (s2.startsWith("name")) {
                    String[] split3 = s2.split("=");
                    employees[i].setName(split3[1]);
                } else if (s2.startsWith("age")) {
                    String[] split3 = s2.split("=");
                    employees[i].setAge(Integer.valueOf(split3[1]));
                } else if (s2.startsWith("salary")) {
                    String[] split3 = s2.split("=");
                    employees[i].setSalary(BigDecimal.valueOf(Double.valueOf(split3[1])));
                } else if (s2.startsWith("hireDate")) {
                    String[] split3 = s2.split("=");
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    Date parse = simpleDateFormat.parse(split3[1]);
                    employees[i].setHireDate(parse);
                }
            }
            i++;
        }
        BigDecimal money = new BigDecimal("0.0");
        double num = 0;

        for (Employee e : employees) {
            if (e.getHireDate().getYear() < 1997) {
                BigDecimal salary = e.getSalary();
                money = money.add(salary);
                num++;
            }
        }

        BigDecimal divide = money.divide(BigDecimal.valueOf(num));
        System.out.println(divide);


    }
}
