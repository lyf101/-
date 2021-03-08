package cn.lyf.jdbc_demo;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Date:2021/3/8 11:13
 * Author:lyf
 */
public class JDBCDemo {
    public static void main(String[] args) throws Exception {
        //加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //通过DriverManager获取jdbc连接对象
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaweb?useUnicode=true&characterEncoding=utf8", "root", "root");
        //通过连接对象获取执行对象
        Statement statement = connection.createStatement();
        String sql = "insert into student values (null ,'zhangsan',29)";
        statement.executeUpdate(sql);

        statement.close();
        connection.close();

    }
}
