package cn.lyf.propertiesdemo;

import org.junit.Test;

import java.io.IOException;

/**
 * Date:2021/3/2 20:32
 * Author:lyf
 */
public class PropertiesLoadDemoTest {

    @Test
    public void propertiesLoad1() throws IOException {
        PropertiesLoadDemo propertiesLoadDemo = new PropertiesLoadDemo();
        propertiesLoadDemo.propertiesLoad1();
    }

    @Test
    public void propertiesLoad2() throws IOException {
        PropertiesLoadDemo propertiesLoadDemo = new PropertiesLoadDemo();
        propertiesLoadDemo.propertiesLoad2();
    }
}