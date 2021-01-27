package homework.demo06;

/**
 * Date:2021/1/27 19:23
 * Author:lyf
 */
public class ArraySreachDemo {
    public static int binSreach(int[] arr, int key, int low, int high) {
        int mid = (low + high) / 2;
        if (key == arr[mid]) {
            return mid;
        } else if (key > arr[mid]) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
        return binSreach(arr, key, low, high);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int key = 4;
        int low = 0;
        int high = arr.length - 1;
        int i = binSreach(arr, key, low, high);
        System.out.println(i);
    }
}
