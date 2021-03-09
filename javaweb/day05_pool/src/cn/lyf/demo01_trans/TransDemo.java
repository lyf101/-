package cn.lyf.demo01_trans;

import java.sql.*;

/**
 * Date:2021/3/9 10:28
 * Author:lyf
 */
public class TransDemo {
    public static void main(String[] args){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaweb?characterEncoding=utf-8","root","root");
            connection.setAutoCommit(false);
            String sql = "select * from student where name = '张三' and age>20";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                sql = "update student set age = age - 1 where name ='张三'";
                connection.prepareStatement(sql).executeUpdate();
                //int i = 1/0;

                sql = "update student set age = age + 1 where name='大圣'";
                connection.prepareStatement(sql).executeUpdate();
            }
            connection.commit();
        } catch (Exception e) {
            try {
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }
}
