package com.nit.service;

import java.util.List;

import com.nit.command.Book;

public interface BookService {
	public boolean save(Book book);
	public List<Book>fetchBook();
}
