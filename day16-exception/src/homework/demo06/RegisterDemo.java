package homework.demo06;

import java.util.Scanner;

/**
 * Date:2021/2/1 20:02
 * Author:lyf
 */
public class RegisterDemo {

    public static void main(String[] args) throws LogicException {
        System.out.println("请输入纯数字密码：");
        Scanner scanner = new Scanner(System.in);
        String i = scanner.nextLine();
        if(i.matches("\\d*")) {
            System.out.println(i);
        }else {
            throw new LogicException("密码格式错误");
        }
    }
}
