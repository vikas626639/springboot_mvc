package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nit.command.Book;
import com.nit.service.BookService;

@Controller
public class BookController {
	@Autowired
	private BookService service;
	
	@GetMapping(value = {"/","/index"})
	public String loadForm(Model map) {
		//create cmd class object to pass entity object to dispatcher servlet
		Book book=new Book();
		book.setBookname("xxxx");
		book.setBookname("xxxx");
		book.setBookprice("000$");
		map.addAttribute("book", book);
		return "loadBookpage";
	}
	@PostMapping(value = {"/index"})
	public String submitForm(@ModelAttribute("book")Book book,Model model) {
		service.save(book);
		String msg="Book Record Saved.....";
		//model.addAttribute("book", book);
		model.addAttribute("msg", msg);
		model.addAttribute("book", new Book());
		return "loadBookpage";
	}
	
	@GetMapping("/showbook")
	public String displayBook(@ModelAttribute("book")Book book,Model model) {
		//use service 
		List<Book> books = service.fetchBook();
		//send data to user Interface
		model.addAttribute("book", books);
		return "showbook";
	}
}
