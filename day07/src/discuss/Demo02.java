package discuss;

public class Demo02 {
    public static void delete(int[] arr, int count) {
        for (int i = 0; i < arr.length - count; i++) {
            for (int j = i + 1; j < arr.length - count; j++) {
                if (arr[i] == arr[j]) {
                    change(arr, j);
                    delete(arr, ++count);
                }
            }
        }
    }

    public static void change(int[] arr, int index) {
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 4,9, 8, 5, 9,9,9, 5, 1, 3, 0};
        delete(arr, 0);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
