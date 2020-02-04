package com.gaznkj.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
    @RequestMapping("/success")
    public String success(Model model){
        System.out.println("进来了");
        model.addAttribute("msg","不变的消息3");

        model.addAttribute("num",1);
        return "success";
    }

    @RequestMapping("/refresh")
    public String refresh(Model model){
        System.out.println("进来了");
        int max=100,min=1;
        int ran2 = (int) (Math.random()*(max-min)+min);
        System.out.println(ran2);
        model.addAttribute("msg",ran2+"00");
        model.addAttribute("num",new Random());
        return "success::div";
    }


}
