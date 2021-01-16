package discuss;

public class Demo01 {
    public static int strCompare(String str1, String str2) {
        int bool = 0;
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();

        for (int i = 0; i < ((char1.length > char2.length) ? char2.length : char1.length); i++) {
            if (char1[i] > char2[i]) {
                bool = 1;
            } else if (char1[i] < char2[i]) {
                bool = -1;
            }
        }
        if (bool == 0 && char1.length > char2.length) {
            bool = 1;
        } else if (bool == 0 && char1.length < char2.length) {
            bool = -1;
        }
        return bool;
    }

    public static void main(String[] args) {
        String str1 = "ac";
        String str2 = "abc";
        System.out.println(strCompare(str1, str2));
    }
}
