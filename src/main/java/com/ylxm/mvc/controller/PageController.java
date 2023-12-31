package com.ylxm.mvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author lhlog351X
 * com.ylxm.mvc.controller
 * 2023/10/29 17:48
 */

@RestController
@RequestMapping("")
public class PageController {

    @GetMapping("/index")
    public ModelAndView getIndex(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @GetMapping("/per")
    public ModelAndView getPer(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("per");
        return modelAndView;
    }

    @GetMapping("/login")
    public ModelAndView getLogin(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }
}
