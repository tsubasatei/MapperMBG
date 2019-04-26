package com.xt.mybatis;

import com.xt.mybatis.entity.Employee;
import com.xt.mybatis.mapper.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import tk.mybatis.mapper.mapperhelper.MapperHelper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author xt
 * @create 2019/4/25 17:06
 * @Desc
 */
public class EmployeeTest {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = builder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //***********************
        //按照Java方式整合通用Mapper的特殊设置
        //i.创建MapperHelper对象
        MapperHelper mapperHelper = new MapperHelper();

        //ii.通过MapperHelper对象对MyBatis原生的Configuration对象进行处理
        Configuration configuration = sqlSession.getConfiguration();
        mapperHelper.processConfiguration(configuration);

        //***********************

        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        List<Employee> employees = employeeMapper.selectAll();
        employees.stream().forEach(System.out::println);


    }
}
