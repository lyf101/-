package homework.demo001;

import java.util.Arrays;

/**
 * Date:2021/1/27 19:30
 * Author:lyf
 */
public class SreachDemo {

    public static void main(String[] args) {
        char[] arr = {'A','1','R','!','e','&','A','5','A','g','#','D'};
        int num = 0;

        for (int i = 0;i<arr.length;i++){
            String s = String.valueOf(arr[i]);
            if (s.matches("A")){
                num++;
            }
        }
        System.out.println(num);
    }
}
