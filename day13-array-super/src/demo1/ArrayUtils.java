package demo1;


/**
 * Date:2021/1/27 11:43
 * Author:lyf
 */
public class ArrayUtils {
    private ArrayUtils(){}

    public static void arraycopy(int[] fromArr,int fromIndex,int[] toArr,int toIndex,int length){
        for (int i =0;i<length;i++){
            toArr[toIndex+i]=fromArr[fromIndex+i];
        }
    }
}
