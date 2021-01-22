package homeword.demo07;

/**
 * Date:2021/1/22 19:23
 * Author:lyf
 */
public class Student {
    private String no;
    private String name;
    private int score;

    public static int getAvg(Student[] arr) {
        int sum = 0;
        for (Student student : arr) {
            sum += student.getScore();
        }
        return sum / arr.length;
    }

    public Student() {
    }

    public Student(String no, String name, int score) {
        this.no = no;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no='" + no + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
