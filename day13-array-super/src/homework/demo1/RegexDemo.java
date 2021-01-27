package homework.demo1;

/**
 * Date:2021/1/27 18:29
 * Author:lyf
 */
public class RegexDemo {
    public static void main(String[] args) {
        //- 判断一个字符串是否全部有数字组成
        System.out.println("1234".matches("\\d*"));

        //- 判断一个字符串是否是手机号码
        System.out.println("13502322222".matches("1[3-9]\\d{9}"));

        //- 判断一个字符串是否是18位身份证号码
        System.out.println("441424191155554444".matches("\\d{17}[0-9X]"));

        //- 判断一个字符串是否6到16位，且第一个字必须为字母
        System.out.println("asd123aads".matches("[a-zA-Z]\\w{5,15}"));
    }

}
