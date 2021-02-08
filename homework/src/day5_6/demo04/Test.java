package day5_6.demo04;

/**
 * Date:2021/2/4 19:05
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        int count = 0;
        char[] arr = {'A','1','R','!','e','&','A','5','A','g','#','D'};
        for (int i =0;i<arr.length;i++){
            if (arr[i] == 'A'){
                count++;
            }
        }
        System.out.println(count);
    }
}
