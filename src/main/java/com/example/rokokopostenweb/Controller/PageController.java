package com.example.rokokopostenweb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

    @GetMapping("/")
    public ModelAndView showHomepage(){
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("RokokoPosten");
            return modelAndView;
    }
}
