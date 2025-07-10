package com.example.boardserver.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

//mybatis 연동
@Configuration
@MapperScan(basePackages = "com.example.boardserver.mapper")
public class MysqlConfig {
    //DataSource를 파라미터로 받음 → DB 연결 정보를 담고 있음
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception{
        //MyBatis의 핵심 설정 객체
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        //MyBatis가 DB랑 연결할 수 있게 함
        sessionFactory.setDataSource(dataSource);

        //Mapper XML 파일들이 어디 있는지를 지정
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        //classpath:mapper/*.xml → /resources/mapper/ 폴더에 있는 XML들
        //SQL 구문이 담긴 파일들을 찾는 과정
        sessionFactory.setMapperLocations(resolver.getResources("classpath:mapper/*.xml"));

        //resources 폴더에 있는 mybatis-config.xml 파일을 불러오는 과정
        Resource myBatisConfig = new PathMatchingResourcePatternResolver().getResource("classpath:mybatis-config.xml");
        sessionFactory.setConfigLocation(myBatisConfig);

        return sessionFactory.getObject();
    }
}
