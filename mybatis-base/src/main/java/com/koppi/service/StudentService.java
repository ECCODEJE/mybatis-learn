package com.koppi.service;

import com.koppi.pojo.Student;

import java.util.List;

/**
 * @author hechao
 * @date 2022/8/12 15:33
 */
public interface StudentService {
    List<Student> findAll();

    Student findById(Integer id);

    void insert(Student student);

    void delete(String id);

    void update(Student student);
}
