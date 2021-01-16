package homeWork.demo02;

/**
 * Date:2021/1/16 18:39
 * Author:lyf
 */
public class Cat {
    /**
     * 需求：描述猫类
     *
     * 步骤：
     *
     * （1）猫有名字、年龄等状态
     *
     * （2）无参构造器
     *
     * （3）带参数构造器初始化名字和年龄两个字段
     *
     * （4）说话的功能
     */

    String name;
    int age;

    public Cat(){

    }

    public Cat(String aName, int aAge) {
        name = aName;
        age = aAge;
    }

    public void say() {
        System.out.println(name + "猫会说话");
    }
}
