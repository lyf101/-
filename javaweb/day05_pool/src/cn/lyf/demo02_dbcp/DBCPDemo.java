package cn.lyf.demo02_dbcp;


import java.sql.Connection;

/**
 * Date:2021/3/9 16:47
 * Author:lyf
 */
public class DBCPDemo {
    public static void main(String[] args){
        Connection connection = DBCPUtil.getConnection();
        System.out.println(connection);
    }

}
