package com.mobilDev.libraryAutomation.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobilDev.libraryAutomation.entities.Book;
import com.mobilDev.libraryAutomation.repositories.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;

	public List<Book> getBooks() {
     return (List<Book>) bookRepository.findAll();
	}
	
	public Optional<Book> getBookById(Integer Id) {
		return bookRepository.findById(Id);
	}
	
	public void addBook(Book book) {
		bookRepository.save(book);
	}
	
	public void updateBook(Book book) {
		bookRepository.save(book);
	}
	public void deleteBook(Integer Id) {
		bookRepository.deleteById(Id);
	}
}
