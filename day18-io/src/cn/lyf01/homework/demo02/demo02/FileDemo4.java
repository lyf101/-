package cn.lyf01.homework.demo02.demo02;

import java.io.File;

/**
 * Date:2021/2/26 16:44
 * Author:lyf
 */
public class FileDemo4 {
    public static void main(String[] args) {
        File file = new File("D:\\迅雷下载");
        fileName(file);
    }

    public static void fileName(File file){
        if (file.exists()&&file!=null){
            if (file.isFile()){
                String name = file.getName();
                System.out.println(name);
            }else if (file.isDirectory()){
                File[] files = file.listFiles();
                for(File f:files){
                    fileName(f);
                }
            }
        }
    }
}
