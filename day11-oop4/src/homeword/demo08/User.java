package homeword.demo08;

/**
 * Date:2021/1/22 19:33
 * Author:lyf
 */
public class User {
    private String id;
    private String username;
    private String password;
    private String emailAddr = username + "@gameschool.com";
    private static int totalUser = 0;

    public User() {
        User.totalUser++;
    }

    public User(String id, String password) {
        this.id = id;
        this.password = password;
        User.totalUser++;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public static int getTotalUser() {
        return totalUser;
    }


    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", emailAddr='" + emailAddr + '\'' +
                '}';
    }
}
