package com.springapp.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.springapp.entities.Book;
import com.springapp.repositories.BookRepository;

public class BookService {
	
	@Autowired
	private BookRepository repository;
	
	public Map<Long, String> getTemplateList(){
        Map<Long, String> result = new HashMap<>();

        for (Book item : this.repository.findAll()) {
            result.put(item.getId(), item.getName());
        }

        return result;
    }
	
	public List<Book> findAll() {
		return this.repository.findAll();
	}
	
	public Book findBook(final Long bookId) {
        return this.repository.findById(bookId).orElse(null);
    }
	
	public void generateBooks(final Integer nb) {
		for (int i = 0; i < nb; i++) {
			Book book = new Book();
			book.setName("bname"+i);
			book.setNbrpages(100+i);
			book.setPrice(10+i);

			this.repository.save(book);
		}
	}

}




