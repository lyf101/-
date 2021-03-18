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
        ServerSocket socket = new ServerSocket(8080);
        Socket accept = socket.accept();
        InputStream inputStream = accept.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String str = null;
        while ((str = reader.readLine()) != null) {
            if (str.equals("")) {
                break;
            }
            System.out.println(str);
        }
        accept.shutdownInput();

        OutputStream outputStream = accept.getOutputStream();
        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(outputStream));
        printWriter.println("HTTP/1.1 200 OK");
        printWriter.println("Content-Type:text/html;charset=utf-8");
        printWriter.println("");
        printWriter.println("你好阿，客户端");
        printWriter.flush();
        accept.shutdownOutput();
        inputStream.close();
        outputStream.close();

        accept.close();
        socket.close();
    }
}
