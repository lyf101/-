package cn.lyf.demo03_druid;

import java.sql.Connection;

/**
 * Date:2021/3/9 16:59
 * Author:lyf
 */
public class DruidDemo {
    public static void main(String[] args) {
        Connection connection = DruidUtil.getConnection();
    }
}
