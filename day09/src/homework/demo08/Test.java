package homework.demo08;

/**
 * Date:2021/1/19 19:46
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        Item computer1 = new Item();
        computer1.setCode("666");
        computer1.setName("戴尔(DELL)游戏笔记本");
        computer1.setType("游戏");
        computer1.setPrice(5499.00);

        Item computer2 = new Item();
        computer2.setCode("007");
        computer2.setName("苹果(Macbook pro)笔记本");
        computer2.setType("电脑，办公");
        computer2.setPrice(18000.00);

        System.out.println(computer1.toString());
        System.out.println(computer2.toString());
    }
}
