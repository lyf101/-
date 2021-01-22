package homeword.demo06;

/**
 * Date:2021/1/22 19:19
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        Item computer1 = new Item("666", "戴尔游戏笔记本");
        computer1.setPrice(5499.00);
        computer1.setType("游戏");
        System.out.println(computer1.getName());
        System.out.println(computer1.getPrice());

        Item computer2 = new Item("007", "苹果笔记本");
        computer2.setPrice(18000.00);
        computer2.setType("电脑，办公");
        System.out.println(computer2.getName());
        System.out.println(computer2.getPrice());

        System.out.println("总商品数：" + Item.getTotalNum());


    }
}
