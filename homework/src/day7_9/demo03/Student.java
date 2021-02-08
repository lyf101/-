package day7_9.demo03;

/**
 * Date:2021/2/8 10:09
 * Author:lyf
 */
public class Student {
    private String name;
    private String gender;

    public void init(String name,String gender){
        this.name = name;
        this.gender = gender;
    }

    public void diplay(){
        System.out.println("name = "+name+",gender = "+gender);
    }

    public void modify(String name){
        this.name = name;
    }

}
