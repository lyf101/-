package cn.lyf;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Date:2021/3/18 18:33
 * Author:lyf
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(8888);
        Socket accept = socket.accept();
        InputStream inputStream = accept.getInputStream();

        byte[] b=new byte[1024];
        int len=0;
        while ((len = inputStream.read(b)) != -1) {

            System.out.println(new String(b,0,len));
        }
        accept.shutdownInput();

        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("你好，客户端".getBytes());
        accept.shutdownOutput();
        inputStream.close();
        outputStream.close();

        accept.close();
        socket.close();
    }
}
