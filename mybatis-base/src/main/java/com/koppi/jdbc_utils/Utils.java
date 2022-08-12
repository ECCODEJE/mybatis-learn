package com.koppi.jdbc_utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @author hechao
 * @date 2022/8/12 15:37
 */
public class Utils {
    private static SqlSession sqlSession;
    private static final SqlSessionFactoryBuilder factoryBuilder = new SqlSessionFactoryBuilder();

    public static SqlSession getSqlSession() {
        try {
            SqlSessionFactory sessionFactory = factoryBuilder.build(Resources.getResourceAsStream("mybatis-config.xml"));
            sqlSession = sessionFactory.openSession(true);
            return sqlSession;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void closeSqlSession(){
        if (sqlSession == null) {
            return;
        }

        sqlSession.close();
    }
}
