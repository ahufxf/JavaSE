package com.ahu.jdbc;

import org.junit.Test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.Properties;
import java.util.SortedMap;

/**
 * @author ahufxf
 * @create 2021-10-01 00:08
 */
public class JdbcTest {

    @Test
    public void test1() throws SQLException {
        Driver driver = new com.mysql.cj.jdbc.Driver();
        String url = "jdbc:mysql://localhost:3306/test";
        Properties info = new Properties();
        Object o = new Object();
        info.setProperty("user","root");
        info.setProperty("password","fxf9843676321");

        Connection conn = driver.connect(url,info);
        System.out.println(conn);

    }

    @Test
    public void test2() throws SQLException {
        Driver driver = new com.mysql.cj.jdbc.Driver();

        System.out.println(driver.getClass());

    }
}
