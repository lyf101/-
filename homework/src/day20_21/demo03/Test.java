package day20_21.demo03;

/**
 * Date:2021/2/21 10:04
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        Staff staff = new Staff("001","张三",19);
        staff.addSalary(29990);
        System.out.println(staff);
    }
}
