package demo01;

/**
 * Date:2021/1/19 10:37
 * Author:lyf
 */
public class Test1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("s1 = "+s1);
        s1.setName("大狗");
        s1.setAge(20);
        s1.showInfo();

        Student s2 = new Student();
        //当调用方法时，用什么对象调用，方法中的this就表示什么对象，也即当前对象
        System.out.println("s2 = "+s2);
        s2.setName("二狗");
        s2.setAge(20);
        s2.showInfo();

        //随手写
        /*int[] arr1 = {1,0,2};
        int[] arr2 = Arrays.copyOf(arr1, 3);
        for (int i : arr2){
            System.out.println(i);
        }
        boolean equals = Arrays.equals(arr1, arr2);
        System.out.println(equals);*/
    }
}
