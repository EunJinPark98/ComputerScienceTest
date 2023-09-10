package com.eunjin.ComputerScience.test;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @Resource(name = "testService")
    private TestService testService;

    //첫 화면
    @GetMapping("/main")
    public String main(){
        return "/content/test/main";
    }

    // 문제 풀기
    @GetMapping("/test")
    public String test(Model model){
        model.addAttribute("question", testService.showQuestion());
        return "/content/test/test";
    }
    
    // 다음 문제
    @ResponseBody
    @PostMapping("/nextQuestion")
    public TestVO nextQuestion(int questionNum){
        return testService.nextQuestion(questionNum);
    }

    // 문제 추가 페이지로
    @GetMapping("/insertForm")
    public String insertFrom(){
        return "/content/admin/insert_form";
    }

    // 문제 추가
    @PostMapping("/insertQuestion")
    public String insertQuestion(TestVO testVO){
        testService.insertQuestion(testVO);
        return "redirect:/main";
    }


}
