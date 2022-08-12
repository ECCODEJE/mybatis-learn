package com.koppi.mapper;

import com.koppi.pojo.Student;

import java.util.List;

/**
 * @author hechao
 * @date 2022/8/12 15:30
 */
public interface StudentMapper {
    List<Student> findAll();

    Student findById(Integer id);

    void insert(Student student);

    void delete(Integer id);

    void update(Student student);
}
