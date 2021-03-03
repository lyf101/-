package cn.lyf.xmldemo;

import org.junit.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

/**
 * Date:2021/3/2 20:56
 * Author:lyf
 */
public class XMLLoadDemoTest {

    @Test
    public void xmlLoad1() throws IOException, SAXException, ParserConfigurationException {
        XMLLoadDemo xmlLoadDemo = new XMLLoadDemo();
        xmlLoadDemo.xmlLoad1();
    }

    @Test
    public void xmlLoad2() throws ParserConfigurationException, TransformerException, SAXException, IOException {
        XMLLoadDemo xmlLoadDemo = new XMLLoadDemo();
        xmlLoadDemo.xmlLoad2();
    }
}