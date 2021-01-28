package homework.demo02;

import java.util.Arrays;

/**
 * Date:2021/1/28 18:55
 * Author:lyf
 */
public class MyArrayList<T> {
    private  T[] arr ;
    private  int size = 0;

    public MyArrayList() {
        this.arr = (T[])new Object[10];
    }
    public MyArrayList(int length){
        if(length<0){
            System.out.println("容量不能为负数，已经转换为绝对值输入");
            length = -length;
        }
        this.arr = (T[])new Object[length];
    }

    public  void add(Object obj){
        if(this.size == this.arr.length){
            arr = Arrays.copyOf(arr, arr.length * 2 + 2);
        }
        arr[size] = (T)obj;
        size++;
    }

    public void delete(int index){
        if (index>=size||index<0){
            System.out.println("请输入正确索引");
            return;
        }
        for (int i = index;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
    }

    public void upDate(int index,Object obj){
        if (index>=size||index<0){
            System.out.println("请输入正确索引");
            return;
        }
        arr[index] = (T) obj;
    }

    public void find(int index){
        if (index>=size||index<0){
            System.out.println("请输入正确索引");
            return;
        }
        System.out.println(arr[index]);
    }


    public String toString(){
        return Arrays.toString(arr);
    }
}
