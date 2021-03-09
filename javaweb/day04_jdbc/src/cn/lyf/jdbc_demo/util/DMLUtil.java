package cn.lyf.jdbc_demo.util;


import cn.lyf.jdbc_demo.domain.Student;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
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

    public static <T> List<T> query(String sql,Class<T> clazz,Object...objects){

        Connection connection = JDBCUtil.getConnection();
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;
        List<T> list = new LinkedList<>();
        try {
            //获取javabean描述对象
            BeanInfo beanInfo = Introspector.getBeanInfo(clazz,Object.class);

            pstmt = connection.prepareStatement(sql);
            for (int i = 0; i < objects.length; i++) {
                pstmt.setObject(i+1,objects[i]);
            }
            //获取查询结果集
            resultSet = pstmt.executeQuery();
            while (resultSet.next()){

                //创建泛型对象
                T t = clazz.newInstance();
                //获取属性描述器数组
                PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
                //遍历属性描述器
                for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
                    //获取属性的名称，作为列名
                    String name = propertyDescriptor.getName();
                    //获取写方法
                    Method writeMethod = propertyDescriptor.getWriteMethod();
                    //执行写入方法，值为通过列名获取的结果集
                    writeMethod.invoke(t,resultSet.getObject(name));
                }

                list.add(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.release(resultSet,connection,pstmt);
        }
        return list;
    }
}
