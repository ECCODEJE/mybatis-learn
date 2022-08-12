package com.koppi.mapper;

import com.koppi.pojo.Course;

import java.util.List;

/**
 * @author hechao
 * @date 2022/8/12 15:30
 */
public interface CourseMapper {
    List<Course> findAll();

    Course findById(Integer cid);

    void insert(Course course);

    void delete(String id);

    void update(Course course);
}
