package cn.lyf01.homework.demo01;

import java.io.*;

/**
 * Date:2021/2/26 16:00
 * Author:lyf
 */
public class Test01 {

    //需求1：使用文件字节输出流，把程序中数据保存到result1.txt文件，操作英文
    public static void main(String[] args) throws IOException {
        //1.创建一个文件对象
        File file = new File("src\\cn\\lyf01\\homework\\demo01\\result1.txt");
        String str = "asfgca";
        //2.创建一个文件字节输出流
        if(file.exists()&&file.isFile()){
            OutputStream outputStream = new FileOutputStream(file);
            outputStream.write(str.getBytes());
            outputStream.flush();
            outputStream.close();
        }
    }
}
