package com.example.app.dao;

import com.example.app.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by Administrator on 2019/12/9.
 */
public interface StudentRepository  extends MongoRepository<Student,String>{

}
