package com.myPersonalPractice.myWebApp.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("home")
    public ModelAndView home(@RequestParam("name") String myName){

        ModelAndView mv = new ModelAndView();
        mv.addObject("name",myName);
        mv.setViewName("home");
        System.out.println("welcome to home! " + myName);

        return mv;
    }
}
