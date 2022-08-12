package com.koppi.service;

import com.koppi.pojo.Course;
import com.koppi.pojo.Student;

import java.util.List;

/**
 * @author hechao
 * @date 2022/8/12 15:33
 */
public interface CourseService {
    List<Course> findAll();

    Course findById(Integer cid);

    void insert(Course Course);

    void delete(String id);

    void update(Course course);
}
