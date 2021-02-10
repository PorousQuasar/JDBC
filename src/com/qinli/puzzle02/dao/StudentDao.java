package com.qinli.puzzle02.dao;

import com.qinli.puzzle02.entity.Student;
import com.qinli.puzzle02.util.JDBCUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author Cambria
 * @creat 2021/2/7 20:54
 */
public class StudentDao {
    //改
    public static List<Student> selectAll(){
        List<Student> students = new ArrayList<>();
        String sql = "select * from student";

        //在下面写查询语句
        Statement st = null;
        ResultSet rs = null;
        Connection con = null;

        try {

            con = JDBCUtil.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            
            Student student =null;
            
            while(rs.next()){
                String id = rs.getString("id");
                String name = rs.getString("name");
                int gender = rs.getInt("gender");
                int age = rs.getInt("age");
                student = new Student();
                student.setId(id);
                student.setName(name);
                student.setGender(gender);
                student.setAge(age);
                students.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(st != null){
                try {
                    st.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(con != null){
                try {
                    con.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }

        return students;
    }
}

/*
 * Connection 与特定数据库的连接（会话）。
 * ResultSet 表示数据库结果集的数据表，通常通过执行查询数据库的语句生成。
 * SQLException 提供有关数据库访问错误或其他错误的信息的异常。
 * Statement 用于执行静态SQL语句并返回其生成的结果的对象。
 */

//我就说怎么老报错结果是因为gender是int吗
//草率了草率了
