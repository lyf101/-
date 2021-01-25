package homework.demo11;

/**
 * Date:2021/1/25 20:46
 * Author:lyf
 */
public class Demo {
    public static void main(String[] args) {
        String[] strs = {"2+3+4","2+4","5+6","9+7"};
        int sum = 0;
        for (String str : strs){
            String[] split = str.split("\\+");
            for (String s : split){
                int i = Integer.valueOf(s);
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
