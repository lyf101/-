package cn.lyf.demo_project.dao.impl;


import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Date:2021/3/10 11:24
 * Author:lyf
 */
public  class ResultSetHandle {

    public static  <T> List<T> resultSetHandle(ResultSet resultSet, Class<T> clazz) {

        List<T> list = new ArrayList<>();

        try {
            //遍历结果集
            while (resultSet.next()) {
                //获取实例对象，用于封装结果集到javabean中
                T t = clazz.newInstance();
                //通过Introspector获取bean属性对象,(当前对象，到某对象结束)不然会获取父类的所有bean对象
                BeanInfo beanInfo = Introspector.getBeanInfo(clazz, Object.class);
                //通过beanInfo获取所有属性描述器
                PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
                for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
                    //通过属性描述器获取属性名
                    String name = propertyDescriptor.getName();
                    //获取结果集中对应的值
                    Object value = resultSet.getObject(name);
                    //获取bean中写的方法
                    Method writeMethod = propertyDescriptor.getWriteMethod();
                    //执行写的方法
                    writeMethod.invoke(t, value);
                }
                //将已经封装好的一个对象放入list中
                list.add(t);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
