package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormController {
	
	//spring 4.x onword multiple httprequest method has given
	@GetMapping(value = {"/","/submit"})
	public String loadform() {
		return "loadform";
	}
	
	/*@PostMapping("/submit")
	public String processform(HttpServletRequest req,Model map) {
		//capture the form data
		String uname = req.getParameter("uname");
		String pwd = req.getParameter("pwd");
		String email = req.getParameter("email");
		String phno = req.getParameter("phno");
		System.err.println("USERNAME="+uname);
		System.err.println("PASSWORD="+pwd);		
		System.err.println("EMAIL="+email);
		System.err.println("Phone Number="+phno);
		System.out.println();
		map.addAttribute("submit_key", "Ragistration Successfull...");
		return "display";
	}
	
	by capture the form data using req.getparam() when form having multiple filed 
	its called boiler plate code to avoid this functinality spring provide dispatcher servlet to capture form data
	*/
}

