package com.eunjin.ComputerScience.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestServiceImpl {

    @GetMapping("/main")
    public String main(){
        return "/content/test/main";
    }
}
