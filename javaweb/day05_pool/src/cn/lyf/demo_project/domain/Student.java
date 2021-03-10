package cn.lyf.demo_project.domain;

import java.sql.Date;

/**
 * Date:2021/3/10 10:00
 * Author:lyf
 */
public class Student {
    private Integer userId;
    private String userName;
    private String sex;
    private Date birthYear;
    private Date grade;
    private Integer collegeID;

    @Override
    public String toString() {
        return "Student{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex='" + sex + '\'' +
                ", birthYear=" + birthYear +
                ", grade=" + grade +
                ", collegeID=" + collegeID +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Date birthYear) {
        this.birthYear = birthYear;
    }

    public Date getGrade() {
        return grade;
    }

    public void setGrade(Date grade) {
        this.grade = grade;
    }

    public Integer getCollegeID() {
        return collegeID;
    }

    public void setCollegeID(Integer collegeID) {
        this.collegeID = collegeID;
    }
}
