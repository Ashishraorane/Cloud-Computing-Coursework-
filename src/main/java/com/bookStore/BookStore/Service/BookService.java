package com.bookStore.BookStore.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.BookStore.Entity.Book;
import com.bookStore.BookStore.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bRepo;
	
	public void save(Book b) {
		bRepo.save(b);
	}
	
	public List<Book> getAllBook(){
		return (List<Book>) bRepo.findAll();
	}
	
	public Book getBookById(String id) {
		return bRepo.findById(id).get();
	}
	public void deleteById(String id) {
		bRepo.deleteById(id);
	}
}
