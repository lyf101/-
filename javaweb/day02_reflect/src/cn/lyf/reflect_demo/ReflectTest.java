package cn.lyf.reflect_demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Date:2021/3/3 15:10
 * Author:lyf
 */
public class ReflectTest {
    public static void main(String[] args) throws Exception {

        //通过类限定名获取字节码对象
        Class<?> aClass = Class.forName("cn.lyf.reflect_demo.Person");

        //通过类名点class获取类的字节码对象
        Class<Person> aClass2 = Person.class;

        Person person = new Person();
        Class<? extends Person> aClass3 = person.getClass();

        //通过字节码对象获取全部构造器对象
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();

        //通过参数名获取构造器(无参)
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
        //通过无参构造器创建实例
        Object o = declaredConstructor.newInstance();
        System.out.println(o);
        //通过参数名获取构造器(有参)，传入参数的字节码对象
        Constructor<?> declaredConstructor1 = aClass.getDeclaredConstructor(String.class, Integer.class);
        //通过有参构造器创建实例，传入参数
        Object zhangsan = declaredConstructor1.newInstance("张三", 15);
        System.out.println(zhangsan);

        //通过字节码对象直接创建实例（无参）
        Object obj = aClass.newInstance();

        //通过字节码对象获取所有方法(包括继承的)
        /*Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }*/

        //通过字节码对象获取本类所有方法（lombok自动生成的方法获取不了）
        /*Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }*/


        //通过方法名获取方法
        Method test = aClass.getDeclaredMethod("test");
        //若是有private修饰的就调用
        //test.setAccessible(true);
        //调用方法
        test.invoke(obj);

        //若是静态方法,可以不传对象
        Method staticTest = aClass.getMethod("staticTest",String.class);
        staticTest.invoke(null,"234");

        //

    }
}
