package cn.lyf01.homework.demo01;

import java.io.*;

/**
 * Date:2021/2/26 16:33
 * Author:lyf
 */
public class Test04 {
    //需求4：使用文件字符输入流，读取result2.txt文件中的数据
    public static void main(String[] args) throws IOException {
        //1.创建文件对象
        File file = new File("src\\cn\\lyf01\\homework\\demo01\\result2.txt");
        //2.创建文件字符输入流
        Reader reader = new InputStreamReader(new FileInputStream(file));
        char[] b = new char[2];
        int len ;
        while ((len = reader.read(b))!=-1){
            System.out.println(new String(b,0,len));
        }
        reader.close();
    }
}
