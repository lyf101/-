package cn.lyf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Date:2021/3/18 18:33
 * Author:lyf
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(8080);
        Socket accept = socket.accept();
        InputStream inputStream = accept.getInputStream();

        byte[] b = new byte[1024];
        int len=0;
        while ((len = inputStream.read(b)) != -1) {
            System.out.println(new String(b,0,len));
        }

        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("你好阿，客户端".getBytes());
        accept.shutdownOutput();


        accept.close();
    }
}
