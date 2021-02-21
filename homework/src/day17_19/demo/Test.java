package day17_19.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Date:2021/2/19 10:29
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {

        ArrayList<Movie> list = new ArrayList<>();
        list.add(new Movie("大圣归来","田晓鹏","张一宗",123));
        list.add(new Movie("大圣再归来","曾伦","霸哥*爱德华",123));
        list.add(new Movie("大圣还归来","吴蔚","尼格拉斯*霸哥",123));


        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎光临wolfcode国家影院");
        System.out.println("-------------------------------------");
        int n = 1;
        while (n == 1){
            menu();
            int sw = sc.nextInt();
            switch (sw){
                case 1:
                    case1(list, sc);
                    break;
                case 2:
                    case2(list, sc);
                    break;
                case 3:
                    case3(list, sc);
                    break;
                case 4:
                    n = 0;
                    break;
                default:
                        System.out.println("输入选项错误，请重新选择");
            }
        }
    }

    public static void case3(ArrayList<Movie> list, Scanner sc) {
        System.out.println("请输入要删除电影得名称：");
        String name = sc.next();
        Iterator<Movie> iterator = list.iterator();
        while (iterator.hasNext()){
            if (iterator.next().getName().equals(name)){
                iterator.remove();
                System.out.println("《"+name+"》删除成功");
            }
        }
    }

    public static void case1(ArrayList<Movie> list, Scanner sc) {
        Movie movie = new Movie();
        System.out.println("请输入电影名称：");
        movie.setName(sc.next());
        System.out.println("请输入电影导演：");
        movie.setDirector(sc.next());
        System.out.println("请输入电影主演：");
        movie.setActor(sc.next());
        System.out.println("请输入电影时长：");
        movie.setTime(sc.nextInt());
        list.add(movie);
        System.out.println("《"+movie.getName()+"》添加成功");
    }

    public static void case2(ArrayList<Movie> list, Scanner sc) {
        System.out.println("序号  名称  导演  演员  时长");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + "\t" + list.get(i).getName() + "\t" + list.get(i).getDirector() + "\t" + list.get(i).getActor() + "\t" + list.get(i).getTime());
        }
        System.out.println("输入0返回：");
        int re = sc.nextInt();
    }

    public static void menu() {
        System.out.println("1.新 增 电 影");
        System.out.println("2.查 看 电 影");
        System.out.println("3.删 除 电 影");
        System.out.println("4.退      出");
        System.out.println("-------------------------------------");
        System.out.println("请选择：");
    }
}
