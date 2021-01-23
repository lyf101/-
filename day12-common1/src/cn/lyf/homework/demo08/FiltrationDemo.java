package cn.lyf.homework.demo08;

/**
 * Date:2021/1/23 19:08
 * Author:lyf
 */
public class FiltrationDemo {
    public static void main(String[] args) {
        String[] words = {"卧槽", "sb", "扑街"};
        String text = "卧槽，昨晚又停电了";
        String replace = "";
        for (String word : words) {
            if (text.contains(word)) {
                String stars = "";
                for (int i = 0; i < word.length(); i++) {
                    stars += "*";
                }
               replace = text.replace(word, stars);
            }
        }
        System.out.println(replace);
    }
}
