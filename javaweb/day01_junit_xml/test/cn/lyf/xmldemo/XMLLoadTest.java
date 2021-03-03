package cn.lyf.xmldemo;

import org.junit.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Date:2021/3/2 20:56
 * Author:lyf
 */
public class XMLLoadTest {

    @Test
    public void xmlLoad1() throws IOException, SAXException, ParserConfigurationException {
        XMLLoad xmlLoad = new XMLLoad();
        xmlLoad.xmlLoad1();
    }

    @Test
    public void xmlLoad2() throws ParserConfigurationException, TransformerException, SAXException, IOException {
        XMLLoad xmlLoad = new XMLLoad();
        xmlLoad.xmlLoad2();
    }
}