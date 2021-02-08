package day7_9.demo09;

import java.util.Arrays;

/**
 * Date:2021/2/8 10:52
 * Author:lyf
 */
public class  Gun {
    private static int[] clip = {1,2,3,4,5};

    public static int getNum() {
        return clip.length;
    }

    public static int[] getClip() {
        return clip;
    }

    //装弹
    public static void push(){
        clip = Arrays.copyOf(clip,clip.length+1);
        clip[clip.length-1] = clip[clip.length-2]+1;
    }

    //开枪
    public static void pop(){
            //to：不包括该位置
            clip = Arrays.copyOfRange(clip, 1, clip.length);
    }
}
