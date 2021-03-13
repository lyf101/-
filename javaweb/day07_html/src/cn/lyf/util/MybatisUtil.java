package cn.lyf.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

/**
 * Date:2021/3/13 19:32
 * Author:lyf
 */
public final class MybatisUtil {
    private MybatisUtil(){}

    private static SqlSessionFactory factory = null;
    static {
        try {
            factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession openSqlSession(){
        return factory.openSession();
    }
}
