package cn.lyf01.homework.demo01;

import java.io.*;

/**
 * Date:2021/2/26 16:29
 * Author:lyf
 */
public class Test03 {
    //需求3：使用文件字符输出流，把程序中数据保存到result2.txt文件，操作中文
    public static void main(String[] args) throws IOException {
        //1.创建文件对象
        File file = new File("src\\cn\\lyf01\\homework\\demo01\\result2.txt");
       String str = "我爱中国";
        //2.创建文件字符输出流
        Writer writer = new OutputStreamWriter(new FileOutputStream(file));
        writer.write(str);
        writer.close();
    }
}
