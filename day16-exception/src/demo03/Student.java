package demo03;

/**
 * Date:2021/1/31 16:29
 * Author:lyf
 */
public class Student {
    private String name;
    private String gender;

    public Student() {
    }

    public Student(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) throws GenderException {
        if(gender.equals("男")||gender.equals("女")){
            this.gender = gender;
        }else {
            throw new GenderException("性别不合法");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
