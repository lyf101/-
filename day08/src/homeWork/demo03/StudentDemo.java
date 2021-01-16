package homeWork.demo03;

/**
 * Date:2021/1/16 18:48
 * Author:lyf
 */
public class StudentDemo {

    /**
     * 需求：作为Student类和对象的测试类
     *
     * 步骤：
     *
     * （1）创建学生对象
     *
     * （2）使用setter方法设置值
     *
     * （3）获取对象成员变量的值
     *
     * （4）通过有参数构造器创建对象并使用setter方法修改值
     */

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(18);
        s1.setName("李白");
        System.out.println(s1.getName());

        Student s2 = new Student("杜甫", 16);
        s2.setName("汪伦");
        s2.setAge(15);
        System.out.println(s2.getName());
    }
}
