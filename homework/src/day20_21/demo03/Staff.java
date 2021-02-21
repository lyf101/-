package day20_21.demo03;

/**
 * Date:2021/2/21 9:58
 * Author:lyf
 */
public class Staff {
    private String id;
    private String name;
    private int age;
    private double salary;
    private String idCard;
    private int staffNum;

    public Staff(String id, String name, int age) {
        this.id = id;
        if (name.equals("")||name==null){
            throw new NullPointerException("姓名不能为空");
        }else {
            this.name = name;
        }
        if (age<18){
            throw new LowAgeException("年龄太小");
        }else if (age>60){
            throw new HighAgeException("年龄太大");
        }else {
            this.age = age;
        }
    }

    public void addSalary(double addSalary){
        if (addSalary>5000){
            throw new HighSalaryException("工资太高");
        }else {
            this.salary+=addSalary;
        }
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", idCard='" + idCard + '\'' +
                ", staffNum=" + staffNum +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public int getStaffNum() {
        return staffNum;
    }

    public void setStaffNum(int staffNum) {
        this.staffNum = staffNum;
    }
}
