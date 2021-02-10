package com.qinli.puzzle02.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @Author Cambria
 * @creat 2021/2/7 20:58
 */
public class JDBCUtil {
    //改
    public static Connection getConnection(){
        
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/qinlistudio?serverTimezone=UTC"
                    ,"root","Durandal0101");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

}

/*
 * DriverManager 管理一组JDBC驱动程序的基本服务。
 * MySQL常见连接URL写法：jdbc:mysql://machine_name:port/dbname
 * mysql连接的依赖包是高版本，可在dbname后加上?serverTimezone=UTC
 */
