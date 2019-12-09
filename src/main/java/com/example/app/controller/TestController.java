package com.example.app.controller;

import com.example.app.impl.StudentService;
import com.example.app.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2019/12/9.
 */
@RestController
@RequestMapping("/student")
public class TestController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/add1")
    public String add1() {
        return "add1";
    }

    @RequestMapping("/add")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @RequestMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    @RequestMapping("/find/{id}")
    public Student findStudentById(@PathVariable("id") String id) {
        return studentService.findStudentById(id);
    }

    @RequestMapping("/delete/{id}")
    public void deleteStudentById(@PathVariable("id") String id) {
        studentService.deleteStudent(id);
    }

    @RequestMapping("/getALlStudents")
    public List<Student> getAllStudents()
    {
        return  studentService.findAllStudent();
    }
}