package cn.lyf.propertiesdemo;

import java.io.*;
import java.util.Properties;

/**
 * Date:2021/3/2 20:23
 * Author:lyf
 */
public class PropertiesLoadDemo {

    public void propertiesLoad1() throws IOException {
        File file = new File("D:\\Idea\\workspacelang\\javaweb\\day01_junit_xml\\resources\\text.properties");
        InputStream is = new FileInputStream(file);

        Properties p = new Properties();
        p.load(is);

        String name = p.getProperty("name");
        String password = p.getProperty("password");

        System.out.println(name);
        System.out.println(password);

    }

    public void propertiesLoad2() throws IOException {
        Properties p = new Properties();
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        InputStream is = contextClassLoader.getResourceAsStream("text.properties");

        p.load(is);
        String name = p.getProperty("name");
        String password = p.getProperty("password");

        System.out.println("name="+name);
        System.out.println("password="+password);
    }
}
