package cn.lyf;

import java.lang.reflect.Method;

/**
 * Date:2021/3/5 18:43
 * Author:lyf
 */
public class AnnocationTest {
    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("cn.lyf.AnnocationDemo");
            Object o = aClass.newInstance();
            Method[] methods = aClass.getDeclaredMethods();
            for (Method method : methods) {
                String[] value = method.getAnnotation(VIP.class).value();
                System.out.println(value[0]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
