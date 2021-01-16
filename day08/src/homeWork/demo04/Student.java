package homeWork.demo04;

/**
 * Date:2021/1/16 18:53
 * Author:lyf
 */
public class Student {
    /**
     * 1、阅读信息卡，完成要求：
     *
     * ​	1>根据信息卡信息，定义一个学生类(Student)，然后实例化 张三，李四 2个对象。
     *
     * ​	2>使用javabean规范做.
     *
     * **对象信息:**
     *
     * 姓名(name)：张三
     *
     * 年龄(age) ：18
     *
     * 性别(gender)：男
     *
     * 英语(enScore)：90
     *
     * 数学(mathScore)：135
     *
     * 语文(cnScore)：105
     *
     * ---
     *
     * 姓名(name)：李四
     *
     * 年龄(age) ：20
     *
     * 性别(gender)：女
     *
     * 英语(enScore)：130
     *
     * 数学(mathScore)：100
     *
     * 语文(cnScore)：125
     */
    private String name;
    private int age;
    private String gender;
    private int enSoore;
    private int mathSoore;
    private int onSoore;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getEnSoore() {
        return enSoore;
    }

    public void setEnSoore(int enSoore) {
        this.enSoore = enSoore;
    }

    public int getMathSoore() {
        return mathSoore;
    }

    public void setMathSoore(int mathSoore) {
        this.mathSoore = mathSoore;
    }

    public int getOnSoore() {
        return onSoore;
    }

    public void setOnSoore(int onSoore) {
        this.onSoore = onSoore;
    }
}
