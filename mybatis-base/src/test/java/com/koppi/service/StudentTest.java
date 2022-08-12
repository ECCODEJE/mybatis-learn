package com.koppi.service;

import com.koppi.jdbc_utils.Utils;
import com.koppi.mapper.StudentMapper;
import com.koppi.pojo.Student;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

/**
 * @author hechao
 * @date 2022/8/12 15:58
 */
public class StudentTest {
    private SqlSession sqlSession;
    private StudentMapper mapper;
    @Before
    public void init(){
        sqlSession = Utils.getSqlSession();
        mapper = sqlSession.getMapper(StudentMapper.class);
    }

    @Test
    public void findAll() {
        List<Student> list = mapper.findAll();
        list.forEach(System.out::println);
    }

    @Test
    public void findById() {
        System.out.println(mapper.findById(1));
    }

    @Test
    public void insert() throws SQLException {
        /*Student student = new Student(null, "小红", 28, 5);
        mapper.insert(student);*/
    }

    @Test
    public void delete() {
        mapper.delete(9);
    }

    @Test
    public void update() {
        /*Student student = new Student(7, "小红", 28, 6);
        mapper.update(student);*/
    }

    @After
    public void destory(){
        Utils.closeSqlSession();
    }
}
