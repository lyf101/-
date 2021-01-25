package stringBuffer1;

/**
 * Date:2021/1/25 11:56
 * Author:lyf
 */
public class Test2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        //增
        sb.append("abc");
        sb.append(true);
        System.out.println(sb);
        //删
        sb.deleteCharAt(1);
        sb.delete(1,2);
        System.out.println(sb);
        //改
        sb.setCharAt(0,'n');
        System.out.println(sb);
    }
}
