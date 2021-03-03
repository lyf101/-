package cn.lyf.reflect_demo;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

/**
 * Date:2021/3/3 20:08
 * Author:lyf
 */
public class IntrospectorTest {
    public static void main(String[] args) throws Exception {

        //获取Person类的字节码对象
        Class<?> aClass = Class.forName("cn.lyf.reflect_demo.Person");
        //通过字节码对象创建实例
        Object o = aClass.newInstance();
        //通过Introspector里的getBeanInfo方法获取BeanInfo对象
        BeanInfo beanInfo = Introspector.getBeanInfo(aClass);
        //获取属性描述器对象
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
            if (propertyDescriptor.getName().equals("name")) {
                //获取属性的set方法
                Method writeMethod = propertyDescriptor.getWriteMethod();
                //运行方法
                writeMethod.invoke(o, "zhangsan");
                //获取属性的get方法
                Method readMethod = propertyDescriptor.getReadMethod();
                Object invoke = readMethod.invoke(o);
                System.out.println(invoke);
            }else if (propertyDescriptor.getName().equals("age")){
                Method writeMethod = propertyDescriptor.getWriteMethod();
                writeMethod.invoke(o,19);
                Method readMethod = propertyDescriptor.getReadMethod();
                Object invoke = readMethod.invoke(o);
                System.out.println(invoke);
            }

        }

    }
}
