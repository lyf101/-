package cn.lyf01.homework.demo02.demo04;

import java.io.*;

/**
 * Date:2021/2/26 17:12
 * Author:lyf
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        //1.创建文件对象
        File file = new File("src\\cn\\lyf01\\homework\\demo02\\demo01\\test.txt");
        //2.创建文件字节输出流
        OutputStream os = new FileOutputStream(file);
        os.write("睡觉哦".getBytes());
        os.close();


    }
}
