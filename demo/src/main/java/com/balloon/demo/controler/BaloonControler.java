package com.balloon.demo.controler;

import com.balloon.demo.sevice.BallonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BaloonControler {
    @Autowired
    BallonService ballon_service;

    @PostMapping ("/test")
    public String getBallons(@RequestParam("someString") String someString, Model model){
        String str1 = "SOME TEXT " + ballon_service.solution(someString) + " more text";
        model.addAttribute("string", str1);
        return "page1";
    }
    @GetMapping("/")
    public String page1(){
        return "page1";
    }
}
