package cn.lyf01.io_file;

import java.io.*;
import java.util.Arrays;

/**
 * Date:2021/2/26 9:57
 * Author:lyf
 */
public class FileDemo {
    public static void main(String[] args) {
        File file = new File("d:\\abc.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            InputStream inputStream = new FileInputStream(file);
            byte[] arr = new byte[5];

            int len = inputStream.read(arr);
            System.out.println(Arrays.toString(arr));
            inputStream.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
