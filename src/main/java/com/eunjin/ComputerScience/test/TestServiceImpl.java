package com.eunjin.ComputerScience.test;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("testService")
public class TestServiceImpl implements TestService{
    @Autowired
    private SqlSessionTemplate sqlSession;



}
