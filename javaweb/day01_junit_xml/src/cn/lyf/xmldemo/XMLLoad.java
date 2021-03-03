package cn.lyf.xmldemo;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;


/**
 * Date:2021/3/2 20:49
 * Author:lyf
 */
public class XMLLoad {
    public void xmlLoad1() throws ParserConfigurationException, IOException, SAXException {

        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        InputStream resourceAsStream = contextClassLoader.getResourceAsStream("text.xml");


        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(resourceAsStream);

        Element root = document.getDocumentElement();
        NodeList a = root.getElementsByTagName("a");
        Node item = a.item(1);
        Node item1 = item.getChildNodes().item(1);
        String textContent = item1.getTextContent();
        System.out.println(textContent);

    }

    public void xmlLoad2() throws ParserConfigurationException, IOException, SAXException, TransformerException {



        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        InputStream resourceAsStream = contextClassLoader.getResourceAsStream("text.xml");

        File file = new File("resources/text.xml");

        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(resourceAsStream);
        //获取根节点
        Element root = document.getDocumentElement();


        Element a1 = document.createElement("新一层");
        Element b3 = document.createElement("二层");
        Element b1 = document.createElement("二层");
        Element b2 = document.createElement("二层");




        a1.setAttribute("name","newA1");
        b3.setAttribute("name","最里层");
        b1.setTextContent("最里层");
        b2.setTextContent("最里层");

        a1.appendChild(b1);
        a1.appendChild(b2);
        a1.appendChild(b3);

        root.appendChild(a1);

        TransformerFactory.newInstance().newTransformer().transform(new DOMSource(document),new StreamResult(file));


    }
}
