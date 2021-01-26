package com.nit.controller;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WishController {
	
	@RequestMapping("/welcome")
	public ModelAndView welcomemsg() {
		ModelAndView mav=new ModelAndView();
		//put data in model scope
		mav.addObject("msg", "Welcome to Spring Mvc");
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping("/wishMsg")
	public ModelAndView wishMsg() {
		ModelAndView mav=new ModelAndView();
		//put data in model scope
		Calendar cal=Calendar.getInstance();
		int hour=0;
		String msg="";
		hour=cal.get(Calendar.HOUR_OF_DAY);
		msg=(hour<=12)?"Good Mourning":(hour<=15)?"Good AfterNoon":(hour<=18)?"Good Evening":"Good Night";
		mav.addObject("wishmsg", msg);
		mav.setViewName("index");
		return mav;
	}

}
