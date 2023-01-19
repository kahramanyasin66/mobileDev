package com.mobildev.library.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mobildev.library.dto.BookResponse;
import com.mobildev.library.entity.Book;

@RestController
public class BookController {
	
	List<Book> bookStore = new ArrayList<>();
	
	@PostMapping("/saveBook")
	public ResponseEntity<Object> addBook(@RequestBody  Book book){
		bookStore.add(book);
		BookResponse<Book> response = new BookResponse<>("success" , book);
		return new ResponseEntity<Object>(response, HttpStatus.OK);
		 
	}
	@GetMapping("/getBooks")
	public ResponseEntity<Object> getAlllBooks(){
		BookResponse<List<Book>> response = new  BookResponse<>("success" , bookStore);
		return new ResponseEntity<Object> (response, HttpStatus.OK);
		
	}
	
	

}
