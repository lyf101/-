package cn.lyf01.homework.demo02.demo07;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Date:2021/2/26 17:26
 * Author:lyf
 */
public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Idea\\workspacelang\\day18-io\\src\\cn\\lyf01\\homework\\demo02\\demo01\\test.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("大气哦");
        fileWriter.close();
    }
}
