package string1;

/**
 * Date:2021/1/25 10:28
 * Author:lyf
 */
public class Test2 {
    public static void main(String[] args) {
        String msg = "卧槽,尼玛还行";
        String[] words = {"卧槽", "尼玛"};

        for (String item: words) {
            if (msg.contains(item)) {
                String stars = "";
                for (int i = 0; i < item.length(); i++) {
                    stars += "*";
                }
                msg = msg.replace(item, stars);
            }
        }
        System.out.println(msg);
    }
}
