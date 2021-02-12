package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nit.command.Student;

@Controller
public class StudentController {
	
	@GetMapping(value= {"/","/showform","/index"})
	public String loadForm(Model map) {
		//create cmd class object and send object to dispatcher servlet to bind form data with object
		Student s=new Student();
		s.setSno(0000);
		s.setAddrs("Address");
		s.setPhno(000000000l);
		s.setSname("xyz");
		map.addAttribute("studentobj", s);
		return "showForm";
	}
	
	@PostMapping(value= {"/showform","/index"})
	public String processForm(Model map,@ModelAttribute("studentobj")Student student) {
		System.out.println(student);
		String msg="Ragistration successfull";
		map.addAttribute("msg", msg);
		map.addAttribute("studentobj", student);
		return "process";
	}
}
