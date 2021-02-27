package cn.lyf.homework.demo2;

import java.io.*;

/**
 * Date:2021/2/27 16:20
 * Author:lyf
 */
public class StreamDemo2 {

    public static void main(String[] args) throws IOException {
        File source = new File("D:\\Idea\\workspacelang\\day19-io\\src\\cn\\lyf\\homework\\a.txt");
        String fileName = source.getName();
        File target = new File("D:\\Idea\\workspacelang\\day19-io\\src\\cn\\lyf\\homework\\demo2\\"+fileName);
        target.createNewFile();

        InputStream inputStream = new FileInputStream(source);
        OutputStream outputStream = new FileOutputStream(target);

        byte[] b = new byte[1024];
        int len;
        while ((len = inputStream.read(b))!=-1){
            outputStream.write(b,0,len);
            outputStream.flush();
        }
        inputStream.close();
        outputStream.close();

    }
}
