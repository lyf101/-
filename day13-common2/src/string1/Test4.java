package string1;

import java.util.Scanner;

/**
 * Date:2021/1/25 11:00
 * Author:lyf
 */
public class Test4 {
    public static void main(String[] args) {
        String str = "      hello    ";
        System.out.println(str.trim().length());

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();

        if (username.trim().equals("wolfcode")&&password.trim().equals("123")){
            System.out.println("登陆成功");
        }else System.out.println("登录失败");




    }
}
