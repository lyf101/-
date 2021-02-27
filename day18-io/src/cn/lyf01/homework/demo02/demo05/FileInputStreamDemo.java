package cn.lyf01.homework.demo02.demo05;

import java.io.*;

/**
 * Date:2021/2/26 17:15
 * Author:lyf
 */
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        //1.创建文件对象
        File file = new File("src\\cn\\lyf01\\homework\\demo02\\demo01\\test.txt");
        //2.创建文件字节输入流
        InputStream is = new FileInputStream(file);
        int len;
        byte[] b = new byte[100];
        while ((len = is.read(b))!=-1){
            System.out.println(new String(b,0,len));
        }
    }
}
