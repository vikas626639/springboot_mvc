package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class MyController {
	@RequestMapping("/getmsg")
	public ModelAndView welcomeMsg() {
		//creating object of ModelAndView
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg", "WELCOME TO SPRING MVC");
		mav.setViewName("welcome");
		return mav;	
	}
}
