package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.nit.command.User;

@Controller
public class FormController {
	//spring 4.x onword multiple httprequest method has given
	@GetMapping(value = {"/","/submit"})
	public String loadform() {
		return "loadform";
	}
	@PostMapping("/submit")
	public String processform(User user,Model map) {
		System.out.println(user);
		map.addAttribute("submit_key", "Ragistration Successfull...");
		return "display";
	}
}

