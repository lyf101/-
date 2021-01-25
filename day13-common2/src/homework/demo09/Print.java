package homework.demo09;

/**
 * Date:2021/1/25 19:43
 * Author:lyf
 */
public class Print implements ILowercaseLetter,IUppercaseLetter{

    @Override
    public void printLowercaseLetter(String str) {
        char[] chars = str.toCharArray();
/*        for (char c : chars){
            if (c+1<98){
                c =(char)(c+32);
            }
        }*/
        for(int i = 0 ;i<chars.length;i++){
            if (chars[i]+1<98){
                chars[i]=(char)(chars[i]+32);
            }
        }
        System.out.println(chars);
    }

    @Override
    public void printUppercaseLetter(String str) {
        {
            char[] chars = str.toCharArray();
            for(int i = 0 ;i<chars.length;i++){
                if (chars[i]+1>98){
                    chars[i]=(char)(chars[i]-32);
                }
            }
            System.out.println(chars);
        }
    }
}
