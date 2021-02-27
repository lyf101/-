package cn.lyf.homework.demo3;

import java.io.*;

/**
 * Date:2021/2/27 16:26
 * Author:lyf
 */
public class ReaderAndWriter {
    public static void main(String[] args) throws IOException {
        File source = new File("D:\\Idea\\workspacelang\\day19-io\\src\\cn\\lyf\\homework\\a.txt");
        File target = new File("D:\\Idea\\workspacelang\\day19-io\\src\\cn\\lyf\\homework\\a_copy.txt");

        Reader fileReader = new FileReader(source);
        Writer fileWriter = new FileWriter(target);

        char[] b = new char[1024];
        int len;
        while ((len = fileReader.read(b))!=-1){
            fileWriter.write(b,0,len);
            fileWriter.flush();
        }
        fileReader.close();
        fileWriter.close();
    }
}
