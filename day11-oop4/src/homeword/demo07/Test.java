package homeword.demo07;

/**
 * Date:2021/1/22 19:27
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("001", "张三", 98);
        Student s2 = new Student("002", "李四", 36);
        Student s3 = new Student("003", "王五", 58);
        Student s4 = new Student("004", "赵六", 46);
        Student s5 = new Student("005", "陈七", 63);

        Student[] students = {s1, s2, s3, s4, s5};

        int avg = Student.getAvg(students);
        System.out.println("平均分为:"+avg);

        for(Student s : students){
            System.out.println(s.toString());
        }


    }
}
