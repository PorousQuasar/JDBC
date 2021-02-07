package com.qinli.puzzle02.domain;

import com.qinli.puzzle02.dao.StudentDao;
import com.qinli.puzzle02.entity.Student;

import java.util.List;

/**
 * @Author Cambria
 * @creat 2021/2/7 20:54
 */
public class Main {

    public static void main(String[] args) {

        List<Student> students = StudentDao.selectAll();

        for (Student student : students) {
            System.out.println(student.toString());
        }

        return;

    }

}
