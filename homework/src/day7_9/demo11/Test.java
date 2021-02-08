package day7_9.demo11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Date:2021/2/8 12:23
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("别克商务舱GL8", 600));
        cars.add(new Car("宝马550i", 500));
        cars.add(new Car("别克林荫大道", 300));

        ArrayList<Bus> buses = new ArrayList<>();
        buses.add(new Bus("金杯", "<=16座", 800));
        buses.add(new Bus("金龙", "<=16座", 800));
        buses.add(new Bus("金杯", ">16座", 1500));
        buses.add(new Bus("金龙", ">16座", 1500));
        String[] login = {"wolfcode", "123"};

        ArrayList<Rent> rents = new ArrayList<>();


        Scanner scanner = new Scanner(System.in);
        int s = 1;
        System.out.println("欢迎光临叩丁狼租车管理系统");
        while (s == 1) {
            menu();
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    System.out.println("你当前选择的是登录模块");
                    System.out.println("请输入用户名：");
                    String username = scanner.next();
                    System.out.println("请输入密码：");
                    String password = scanner.next();
                    if (username.equals(login[0]) && password.equals(login[1])) {
                        System.out.println("恭喜，登录成功!");
                    } else {
                        System.out.println("登陆失败，请重新登录");
                    }
                    break;
                case 2:
                    System.out.println("你当前选择的是租车模块：");
                    String s1 = "y";
                    while (s1.equals("y")) {
                        System.out.println("请选择 1.轿车  2.客车");
                        int select = scanner.nextInt();
                        if (select == 1) {
                            System.out.println("请选择 1.别克商务舱  2.宝马550I  3.别克林荫大道");
                            int type = scanner.nextInt();
                            System.out.println("租用天数：");
                            int day = scanner.nextInt();
                            rents.add(new Rent(cars.get(type - 1).getType(), cars.get(type - 1).getMoney(), day));
                        } else if (select == 2) {
                            System.out.println("请选择 1.金杯  2.金龙");
                            int type = scanner.nextInt();
                            System.out.println("请选择座位数量：1.小于等于16   2.大于16");
                            int num = scanner.nextInt();
                            System.out.println("租用天数：");
                            int day = scanner.nextInt();
                            if (num == 1) {
                                rents.add(new Rent(buses.get(type - 1).getName() + buses.get(type - 1).getType(), buses.get(type - 1).getMoney(), day));
                            } else {
                                rents.add(new Rent(buses.get(type - 1 + 2).getName() + buses.get(type - 1 + 2).getType(), buses.get(type - 1 + 2).getMoney(), day));
                            }
                        }
                        System.out.println("是否继续（y/n）");
                        s1 = scanner.next();
                        if (s1.equals("n")) {
                            System.out.println("--------------------------------------------");
                            System.out.println("序号          类型          价格          天数");
                            double money = 0;
                            for (int idx = 0; idx < rents.size(); idx++) {
                                money += rents.get(idx).sumMoney();
                                System.out.println(idx + 1 + "\t\t\t" + rents.get(idx).getType() + "\t\t" + rents.get(idx).getMoney() + "\t\t\t" + rents.get(idx).getDay());
                            }
                            System.out.println("--------------------------------------------");
                            System.out.println("预计消费：" + money);
                        }
                    }
                    break;
                case 3:
                    System.out.println("你当前选择的是还车模块");
                    System.out.println("你租聘的车辆信息:");
                    System.out.println("--------------------------------------------");
                    System.out.println("序号          类型          价格          天数");
                    double money = 0;
                    for (int idx = 0; idx < rents.size(); idx++) {
                        money += rents.get(idx).sumMoney();
                        System.out.println(idx + 1 + "\t\t\t" + rents.get(idx).getType() + "\t\t" + rents.get(idx).getMoney() + "\t\t\t" + rents.get(idx).getDay());
                    }
                    System.out.println("--------------------------------------------");
                    System.out.println("预计消费：" + money);
                    System.out.println("实际租用天数：");
                    int zsday = scanner.nextInt();
                    System.out.println("--------------------------------------------");
                    System.out.println("序号          类型          价格          天数");
                    double zsmoney = 0;
                    for (int idx = 0; idx < rents.size(); idx++) {
                        rents.get(idx).setDay(zsday);
                        zsmoney += rents.get(idx).sumMoney();
                        System.out.println(idx + 1 + "\t\t\t" + rents.get(idx).getType() + "\t\t" + rents.get(idx).getMoney() + "\t\t\t" + rents.get(idx).getDay());
                    }
                    System.out.println("--------------------------------------------");
                    System.out.print("消费总金额：" + zsmoney);
                    s = 0;
                    break;
            }
        }
    }


    public static void menu() {
        System.out.println("请选择菜单");
        System.out.println("-------------------------");
        System.out.println("[1]登录   [2]租车   [3]还车");
        System.out.println("-------------------------");
        System.out.println("请选择：");
    }
}
