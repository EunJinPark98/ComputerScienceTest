package com.eunjin.ComputerScience.test;

public interface TestService {
    //랜덤 문제
    public TestVO showQuestion();

    //다음 문제
    public TestVO nextQuestion(int questionNum);
}
