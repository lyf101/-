package homework.demo10;

/**
 * Date:2021/1/19 19:58
 * Author:lyf
 */
public class Course {
    private String courseName;
    private int grade;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", grade=" + grade +
                '}';
    }
}
