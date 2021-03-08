package cn.lyf.jdbc_demo.util;


import cn.lyf.jdbc_demo.domain.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 * Date:2021/3/8 18:56
 * Author:lyf
 */
public final class DMLUtil {

    private DMLUtil(){}

    public static void update(String sql,Object...objects){
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            //加载驱动
            //获取连接
            conn = JDBCUtil.getConnection();
            //获取预编译对象
            pstmt = conn.prepareStatement(sql);
            for (int i = 0; i < objects.length; i++) {
                pstmt.setObject(i+1,objects[i]);
            }
            //执行sql语句
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //释放资源
            JDBCUtil.release(conn,pstmt);
        }
    }

    public static List<Student> query(String sql,Object...objects){

        Connection connection = JDBCUtil.getConnection();
        PreparedStatement pstmt = null;
        List<Student> list = new LinkedList<>();
        try {
            pstmt = connection.prepareStatement(sql);
            for (int i = 0; i < objects.length; i++) {
                pstmt.setObject(i+1,objects[i]);
            }
            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()){
                Student student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setAge(resultSet.getInt("age"));
                list.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
