package homework.demo004;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Date:2021/1/30 20:10
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        Worker w1 = new Worker("zhang3", 18, 3000);
        Worker w2 = new Worker("li4", 25, 3500);
        Worker w3 = new Worker("wang5", 22, 3200);

        ArrayList<Worker> list = new ArrayList<>();
        list.add(w1);
        list.add(w2);
        list.add(w3);
        for (Worker w : list) {
            System.out.println(w);
        }
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals("li4")) {
                list.add(i, new Worker("zhao6", 24, 3300));
                break;
            }
        }
        for (Worker w : list) {
            System.out.println(w);
        }
        System.out.println();

        Iterator<Worker> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getName().equals("wang5")) {
                iterator.remove();
            }
        }
        for (Worker w : list) {
            System.out.println(w);
        }
        System.out.println();

        Iterator<Worker> it = list.iterator();
        while (it.hasNext()) {
            it.next().work();
        }
    }
}
