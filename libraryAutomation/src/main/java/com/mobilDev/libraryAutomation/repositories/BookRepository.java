package com.mobilDev.libraryAutomation.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mobilDev.libraryAutomation.entities.Book;
@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {

}
