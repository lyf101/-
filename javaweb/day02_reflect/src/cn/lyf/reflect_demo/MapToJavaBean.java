package cn.lyf.reflect_demo;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Date:2021/3/3 20:25
 * Author:lyf
 */
public class MapToJavaBean {
    public static void main(String[] args) throws Exception {

        Class<?> aClass = Class.forName("cn.lyf.reflect_demo.Person");



        Map<String, Object> map = javaBeanToMap(aClass);
        Set<Map.Entry<String, Object>> entries = map.entrySet();
        for (Map.Entry<String, Object> entry : entries) {
            System.out.println(entry.getKey()+"=="+entry.getValue());
        }
        Person person = mapToJavaBean(map, Person.class);
        System.out.println(person);
    }

    //<T>表明将使用泛型
    private static <T>T mapToJavaBean(Map<String, Object> map, Class<T> clazz) throws Exception {

        T t = clazz.newInstance();

        //通过内省方式获取Bean的信息Introspector.getBeanInfo(字节码对象，stop字节码对象)
        BeanInfo beanInfo = Introspector.getBeanInfo(clazz, Object.class);

        //通过Bean对象获取属性描述器
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();


        for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {


            String name = propertyDescriptor.getName();
            Object value = map.get(name);
            propertyDescriptor.getWriteMethod().invoke(t,value);



        }
        return t;

    }

    private static Map<String,Object> javaBeanToMap(Class<?> aClass) throws Exception {

        Object o = aClass.newInstance();
        Map<String,Object> map = new HashMap<>();
        BeanInfo beanInfo = Introspector.getBeanInfo(aClass,Object.class);
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();

        for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {


            if (propertyDescriptor.getName().equals("name")){
                Method writeMethod = propertyDescriptor.getWriteMethod();
                writeMethod.invoke(o,"张三");
            }else if(propertyDescriptor.getName().equals("age")){
                Method writeMethod = propertyDescriptor.getWriteMethod();
                writeMethod.invoke(o,18);
            }
            String key = propertyDescriptor.getName();
            Method readMethod = propertyDescriptor.getReadMethod();
            Object value = readMethod.invoke(o);
            map.put(key,value);
        }
        return map;

    }


}
