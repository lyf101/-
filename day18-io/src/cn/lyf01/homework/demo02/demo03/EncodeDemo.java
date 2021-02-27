package cn.lyf01.homework.demo02.demo03;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * Date:2021/2/26 17:07
 * Author:lyf
 */
public class EncodeDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "中国";
        String encode = URLEncoder.encode(str, "UTF-8");
        System.out.println(encode);

        String decode = URLDecoder.decode(encode, "UTF-8");
        System.out.println(decode);
    }
}
