package com.nit.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {
	@RequestMapping(value = {"/","/index","/home"})
	public String getMsg(Model map) {
		map.addAttribute("msg", "hiiiiii vikas  GOOD MOURNING");
		return "welcome";
	}
	
	@RequestMapping(value = {"/date"})
	public String displayDate(Model map) {
		Date d=new Date();
		map.addAttribute("date", d);
		return "date";
	}
	
	@RequestMapping("/price")
	public @ResponseBody String getprice() {
		return "today gold price is=$4500";
	}
}
