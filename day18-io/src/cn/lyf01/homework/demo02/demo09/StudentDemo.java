package cn.lyf01.homework.demo02.demo09;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Date:2021/2/26 17:56
 * Author:lyf
 */
public class StudentDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Idea\\workspacelang\\day18-io\\src\\cn\\lyf01\\homework\\demo02\\demo09\\Student.txt");
        FileReader fileReader = new FileReader(file);
        String str = "";
        int len;
        char[] c = new char[1024];
        while ((len = fileReader.read(c)) != -1) {
            str += new String(c, 0, len);
        }

        List<Student> list = new ArrayList<>();
        String[] stu = str.split(";");
        for (String s : stu) {
            String[] split = s.split("-");
            list.add(new Student(split[0],Integer.valueOf(split[1]),Integer.valueOf(split[2])));
        }

        int scoreSum=0;
        for (Student s : list){
            scoreSum+=s.getScore();
        }
        System.out.println(scoreSum);
    }
}
