package cn.lyf.demo02_dbcp;

import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

/**
 * Date:2021/3/9 16:55
 * Author:lyf
 */
public final class DBCPUtil {
    private DBCPUtil(){}
    private static Properties properties = null;

    static {
        if (properties==null){
            properties = new Properties();
        }
        try {
            properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static Connection getConnection(){
        try {
            DataSource dataSource  = BasicDataSourceFactory.createDataSource(properties);
            return dataSource.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
