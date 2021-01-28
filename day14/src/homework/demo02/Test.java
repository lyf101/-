package homework.demo02;

/**
 * Date:2021/1/28 19:11
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>(1);
        list.add("S");
        System.out.println(list);
        list.add("3");
        list.add("2");
        list.add("tf");
        list.add("as");
        list.add("v");
        list.add("jj");
        System.out.println(list);

        list.delete(2);
        System.out.println(list);

        list.upDate(0,"in");
        System.out.println(list);

        list.find(2);


    }
}
