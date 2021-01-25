package stringBuffer1;

/**
 * Date:2021/1/25 14:33
 * Author:lyf
 */
public class Test3 {
    public static void main(String[] args) {
        //可变字符串
        StringBuffer sb = new StringBuffer(100);
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        //链式操作
        sb.append("helloworld").replace(0,5,"HELLO");
        System.out.println(sb);

        Student student = new Student("张三");
        student.sayHi().learn();
    }
}
