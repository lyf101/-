package homework.demo001;

/**
 * Date:2021/2/2 10:16
 * Author:lyf
 */
public class Staff {
    private String num;
    private String name;
    private int age;
    private double salary;
    private String idCard;
    private String staffNum;

    public Staff(String num, String name, int age) throws LowAgeException, HighAgeException {
        this.num = num;
        this.name = name;
        if(age<18){
            throw new LowAgeException("年龄小于18");
        }else if(age>60){
            throw new HighAgeException("年龄大于18");
        }else {
            this.age = age;
        }
    }

    public Staff(String num, int i, String 李四) {
    }

    public void addSalary(double salary) throws HighSalaryException {
        if (salary > 5000) {
            throw new HighSalaryException("工资太高了");
        } else {
            this.salary = salary + this.salary;
        }
    }

    @Override
    public String toString() {
        return "Staff{" +
                "num='" + num + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", money=" + salary +
                ", idCard='" + idCard + '\'' +
                ", staffNum='" + staffNum + '\'' +
                '}';
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
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

    public void setAge(int age) throws LowAgeException, HighAgeException {
        if(age<18){
            throw new LowAgeException("年龄小于18");
        }else if(age>60){
            throw new HighAgeException("年龄大于18");
        }else {
            this.age = age;
        }
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

    public String getStaffNum() {
        return staffNum;
    }

    public void setStaffNum(String staffNum) {
        this.staffNum = staffNum;
    }
}
