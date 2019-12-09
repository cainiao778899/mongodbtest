package com.example.app.impl;

import com.example.app.dao.StudentRepository;
import com.example.app.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/12/9.
 */
@Service
public class StudentServiceImpl  implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(String id) {
         studentRepository.deleteById(id);
    }

    @Override
    public Student updateStudent(Student student) {

        Student oldStudent= this.findStudentById(student.getId());

        if (oldStudent!=null)
        {
            oldStudent.setStudentId(student.getStudentId());
            oldStudent.setAge(student.getAge());
            oldStudent.setName(student.getName());
            oldStudent.setGender(student.getGender());
            return studentRepository.save(oldStudent);
        }
        else
        {
            return null;
        }
    }

    @Override
    public Student findStudentById(String id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public List<Student> findAllStudent() {
        return studentRepository.findAll();
    }
}
