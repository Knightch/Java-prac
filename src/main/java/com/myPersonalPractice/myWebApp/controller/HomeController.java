package com.myPersonalPractice.myWebApp.controller;

import com.myPersonalPractice.myWebApp.model.Alien;
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
    public ModelAndView home(Alien alien){

        ModelAndView mv = new ModelAndView();
        mv.addObject("obj",alien);
        mv.setViewName("home");
        System.out.println("your id is " + alien.getAid());
        System.out.println("welcome to home! " + alien.getAname());
        System.out.println("your language is " + alien.getLang());

        return mv;
    }
}
