package com.crazy.rain.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @ClassName: JDBCConnectionUtil
 * @Description: jdbc连接类
 * @author: CrazyRain
 * @date: 2024/1/21 15:42
 */

public class JDBCConnectionUtil {
    private static final ThreadLocal<Connection> threadLocal = new ThreadLocal<>();

    private static final DataSource dataSource;

    static {
        InputStream resourceAsStream = JDBCConnectionUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
        Properties properties = new Properties();
        try {
            properties.load(resourceAsStream);
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static DataSource getDataSource() {
        return dataSource;
    }

    public static Connection getConnection() {
        if (threadLocal.get() != null) {
            return threadLocal.get();
        }
        try {
            threadLocal.set(dataSource.getConnection());
            return threadLocal.get();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void cloneConnection() {
        Connection connection = threadLocal.get();
        try {
            connection.setAutoCommit(true);
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
