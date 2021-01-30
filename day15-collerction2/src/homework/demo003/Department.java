package homework.demo003;

import java.util.Collection;

/**
 * Date:2021/1/30 20:01
 * Author:lyf
 */
public class Department {
    private String deptName;
    private Collection<Employee> emps;

    public Department(String deptName, Collection<Employee> emps) {
        this.deptName = deptName;
        this.emps = emps;
    }


    public Department() {
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptName='" + deptName + '\'' +
                ", emps=" + emps +
                '}';
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Collection<Employee> getEmps() {
        return emps;
    }

    public void setEmps(Collection<Employee> emps) {
        this.emps = emps;
    }
}
