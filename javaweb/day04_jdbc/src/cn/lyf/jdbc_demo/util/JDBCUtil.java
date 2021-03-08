package cn.lyf.jdbc_demo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Date:2021/3/8 18:46
 * Author:lyf
 */
public final class JDBCUtil {

    private JDBCUtil(){}

    static Properties p = new Properties();

    static {
        try {
            p.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties"));
            Class.forName(p.getProperty("driverClassName"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        Connection conn = null;
        try {
           conn = DriverManager.getConnection(p.getProperty("url"), p.getProperty("username"), p.getProperty("password"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }


    public static void release(Connection conn, PreparedStatement pstmt){
        if (conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (pstmt != null){
            try {
                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }




}
