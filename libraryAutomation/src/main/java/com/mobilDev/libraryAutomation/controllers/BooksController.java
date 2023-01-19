package com.mobilDev.libraryAutomation.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mobilDev.libraryAutomation.entities.Book;
import com.mobilDev.libraryAutomation.services.BookService;



@Controller
public class BooksController {
	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	public String getBooks(Model model ) {
		model.addAttribute("books", bookService.getBooks());
		return "books";
	}
   
	@GetMapping("onebooks")
	@ResponseBody
	public Optional<Book> getBookById(Integer Id, Model model){
		return  bookService.getBookById(Id);
	}
	
	@RequestMapping(value="/addnew", method = {RequestMethod.POST})
	public String addBook(Book book) {
		bookService.addBook(book);
		return "redirect:/books";
	}
	
	@RequestMapping(value="/save", method = {RequestMethod.POST})
	public String updateBook(Book book) {
		bookService.updateBook(book);
		return "redirect:/books";
	}
	@RequestMapping(value="/delete", method = {RequestMethod.DELETE})
	public String deleteBook(Integer Id) {
		bookService.deleteBook(Id);
		return "redirect:/books";
	}
}
