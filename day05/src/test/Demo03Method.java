package test;

public class Demo03Method {
    public static void main(String[] args) {

        int[] arr = {2, 5, 4, 8, 14, 6, 3, 5};
        int key = 14;
        int index = -1;

        if(indexOf1(arr,key) == -1){
            System.out.println("没找到");
        }else {
            System.out.println("第一个索引为：" + index);
        }


    }

    //传入int数组，返回指定元素在数组中出现的第一个索引
    public static int indexOf1(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    //传入int数组，返回指定元素在数组中出现的第一个索引
    public static int indexOf2(int[] arr, int key) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }
        return index;
    }
}
