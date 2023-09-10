package com.eunjin.ComputerScience.test;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
