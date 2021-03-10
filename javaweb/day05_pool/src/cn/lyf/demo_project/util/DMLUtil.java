package cn.lyf.demo_project.util;

import cn.lyf.demo_project.dao.impl.ResultSetHandle;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Date:2021/3/10 10:28
 * Author:lyf
 */
public final class DMLUtil {
    private DMLUtil(){}

    public static void update(String sql,Object...objects){
        Connection conn = DruidUtil.getConnection();
        PreparedStatement pstmt = null;
        try {
            //获取连接
            //获取预编译对象
            pstmt = conn.prepareStatement(sql);
            //填充参数
            for (int i = 0; i < objects.length; i++) {
                pstmt.setObject(i+1,objects[i]);
            }
            //执行预编译对象
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DruidUtil.release(conn,pstmt);
        }

    }

    public static <T> List<T> query(String sql,Class<T> clazz,Object...objects){
        List<T> list = new ArrayList<>();
        Connection conn = DruidUtil.getConnection();
        ResultSet resultSet = null;
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement(sql);
            //通过遍历，将sql中的参数补全
            for (int i = 0; i < objects.length; i++) {
                pstmt.setObject(i+1,objects[i]);
            }
            //执行预编译对象，获取resultSet结果集
            resultSet = pstmt.executeQuery();
            //将结果集传入结果集处理类中
            list = ResultSetHandle.resultSetHandle(resultSet, clazz);

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            DruidUtil.release(resultSet,conn,pstmt);
        }
        //返回list
        return list;



    }

}
