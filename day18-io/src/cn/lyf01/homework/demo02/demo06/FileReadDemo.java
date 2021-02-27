package cn.lyf01.homework.demo02.demo06;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Date:2021/2/26 17:21
 * Author:lyf
 */
public class FileReadDemo {
    public static void main(String[] args) throws IOException {
        //1.创建文件对象
        File file = new File("D:\\Idea\\workspacelang\\day18-io\\src\\cn\\lyf01\\homework\\demo02\\demo01\\test.txt");
        //2.创建字符文件输入流
        FileReader fileReader = new FileReader(file);
        int len ;
        char[] c = new char[10];
        while ((len = fileReader.read(c))!=-1){
            System.out.println(new String(c,0,len));
        }
        fileReader.close();
    }
}
