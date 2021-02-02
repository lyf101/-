package homework.demo001;

/**
 * Date:2021/2/2 10:19
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) throws HighAgeException, LowAgeException, HighSalaryException {
         Staff staff = new Staff("001","李四",13);

         staff.addSalary(9000);
        System.out.println(staff.getSalary());

    }
}
