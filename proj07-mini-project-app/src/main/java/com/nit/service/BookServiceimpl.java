package com.nit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.command.Book;
import com.nit.entity.BookEntity;
import com.nit.repository.BookRepository;
@Service
public class BookServiceimpl implements BookService {
	@Autowired
	private BookRepository repo;

	@Override
	public boolean save(Book book) {
		//use repo
		//creating object of entity class to save record
		BookEntity entity=new BookEntity();
		BeanUtils.copyProperties(book, entity);
		repo.save(entity);
		return true;
	}

	@Override
	public List<Book> fetchBook() {
		//fetch book from db
		List<BookEntity> entity = repo.findAll();
		//create cmd class object to put the books in list
		List<Book> listbook=new ArrayList<Book>();
		//copy entity data in cmd class book data
		entity.forEach(e->{
			//create object of Book class and put each book record in one object
			Book book=new Book();
			BeanUtils.copyProperties(e,book);
			listbook.add(book);
		});
		return listbook;
	}
}
