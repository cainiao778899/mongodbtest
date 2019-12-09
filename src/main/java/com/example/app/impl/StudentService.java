package com.example.app.impl;

import com.example.app.model.Student;

import java.util.List;

/**
 * Created by Administrator on 2019/12/9.
 */
public interface StudentService {

    Student addStudent(Student student);

    void  deleteStudent(String id);

    Student updateStudent(Student student);

    Student findStudentById(String id);

    List<Student> findAllStudent();
}
