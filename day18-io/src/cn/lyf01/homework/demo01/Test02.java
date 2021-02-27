package cn.lyf01.homework.demo01;

import java.io.*;

/**
 * Date:2021/2/26 16:18
 * Author:lyf
 */
public class Test02 {
    //需求2：使用文件字节输入流，读取result1.txt文件中的数据
    public static void main(String[] args) throws IOException {
        //1.创建文件对象
        File file = new File("src/cn/lyf01/homework/demo01/result1.txt");

        //2.创建文件字节输入流
        InputStream inputStream = new FileInputStream(file);
        int len;
        byte[] b = new byte[2];
        while ((len = inputStream.read(b)) != -1){
            System.out.println(new String(b,0,len));
        }
        inputStream.close();
    }
}
