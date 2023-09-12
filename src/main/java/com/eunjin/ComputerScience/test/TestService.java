package com.eunjin.ComputerScience.test;

public interface TestService {
    //랜덤 문제
    public TestVO showQuestion();

    //다음 문제
    public TestVO nextQuestion(int questionNum);

    //문제 추가
    public void insertQuestion(TestVO testVO);

    //해당 문제 안 보이게
    public void updateHide(int questionNum);

    //해당 문제 보이게
    public void updateShow(int questionNum);
}
