package cn.lyf.homework.demo5;

import java.io.*;

/**
 * Date:2021/2/27 16:32
 * Author:lyf
 */
public class ObjectInputAndOutDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student("西欧了", 23);
        File file = new File("D:\\Idea\\workspacelang\\day19-io\\src\\cn\\lyf\\homework\\demo5\\student.txt");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));

        objectOutputStream.writeObject(student);

        Object object = objectInputStream.readObject();
        System.out.println(object);
        System.out.println(student);
        System.out.println(object==student);
        System.out.println(object.equals(student));

    }
}
