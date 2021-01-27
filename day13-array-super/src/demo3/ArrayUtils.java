package demo3;

/**
 * Date:2021/1/27 15:49
 * Author:lyf
 */
public class ArrayUtils {
    private ArrayUtils(){}
    public static int binarySearch(int[] array,int key){
        int low = 0;
        int high = array.length-1;
        int mid = 0;

        while (low<=high){
            mid = (low+high)/2;
            if (array[mid]>key){
                high = mid-1;
            }else if(array[mid]<key){
                low = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
