package cn.lyf.demo03_druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.Properties;

/**
 * Date:2021/3/9 17:02
 * Author:lyf
 */
public final class DruidUtil {
    private DruidUtil(){}

    private static Properties properties = null;

    static {
        if (properties == null){
            properties = new Properties();
        }
        try {
            properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        try {
            DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
            return dataSource.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
