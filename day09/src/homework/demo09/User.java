package homework.demo09;

/**
 * Date:2021/1/19 19:52
 * Author:lyf
 */
public class User  {
    private String id;
    private String password;
    private String emailAdrr;

    public User(){}

    public User(String id,String password){
        this.id = id;
        this.password = password;
        this.emailAdrr = id+"@gameschool.com";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailAdrr() {
        return emailAdrr;
    }

    public void setEmailAdrr(String emailAdrr) {
        this.emailAdrr = emailAdrr;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", emailAdrr='" + emailAdrr + '\'' +
                '}';
    }
}
