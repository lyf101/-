package cn.lyf01.homework.demo02.demo01;

import java.io.File;

/**
 * Date:2021/2/26 16:39
 * Author:lyf
 */
public class FileDemo1 {
    public static void main(String[] args) {
        File file = new File("src/cn/lyf01/homework/demo02/demo01/test.txt");
        //路径
        String path = file.getPath();
        System.out.println(path);
        String absolutePath = file.getAbsolutePath();
        System.out.println(absolutePath);
        //检测状态
        boolean file1 = file.isFile();
        System.out.println(file1);
        boolean directory = file.isDirectory();
        System.out.println(directory);


    }
}
