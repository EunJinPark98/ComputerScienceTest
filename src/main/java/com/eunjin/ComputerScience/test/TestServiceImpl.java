package com.eunjin.ComputerScience.test;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("testService")
public class TestServiceImpl implements TestService{
    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public TestVO showQuestion() {
        return sqlSession.selectOne("testMapper.showQuestion");
    }

    @Override
    public TestVO nextQuestion(int questionNum) {
        return sqlSession.selectOne("testMapper.nextQuestion", questionNum);
    }

    @Override
    public void insertQuestion(TestVO testVO) {
        sqlSession.insert("testMapper.insertQuestion", testVO);
    }

    @Override
    public void updateHide(int questionNum) {
        sqlSession.update("testMapper.updateHide", questionNum);
    }

    @Override
    public void updateShow(int questionNum) {
        sqlSession.update("testMapper.updateShow", questionNum);
    }


}
