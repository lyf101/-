package cn.lyf.demo_project.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Date:2021/3/10 10:09
 * Author:lyf
 */
public final class DruidUtil {
    private DruidUtil(){}

    private static Properties properties = new Properties();
    private static Connection connection = null;


    static {
        try {
            properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties"));
            connection = DruidDataSourceFactory.createDataSource(properties).getConnection();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static Connection getConnection(){
        return connection;
    }

    public static void release(Connection connection, PreparedStatement pstmt){
        release(null,connection,pstmt);
    }

    public static void release(ResultSet resultSet,Connection connection, PreparedStatement pstmt){
        if (resultSet!=null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (pstmt!=null){
            try {
                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
