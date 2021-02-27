package cn.lyf.homework.demo4;

import java.io.*;

/**
 * Date:2021/2/27 16:28
 * Author:lyf
 */
public class BufferedInAndOutDemo {
    public static void main(String[] args) throws IOException {
        File source = new File("D:\\Idea\\workspacelang\\day19-io\\src\\cn\\lyf\\homework\\a.txt");
        File target = new File("D:\\Idea\\workspacelang\\day19-io\\src\\cn\\lyf\\homework\\a_copy.txt");

        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(source));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(target));

        byte[] b = new byte[1024];
        int len;
        while ((len = bufferedInputStream.read(b))!=-1){
            bufferedOutputStream.write(b,0,len);
            bufferedOutputStream.flush();
        }
        bufferedOutputStream.close();
        bufferedInputStream.close();
    }
}
