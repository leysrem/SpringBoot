package com.springapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springapp.dtos.BookDto;
import com.springapp.entities.Book;
import com.springapp.entities.User;
import com.springapp.services.UserService;


@Controller
@RequestMapping(BookController.BASE_ROUTE)
public class BookController extends BaseCrudController<Book, Book> {
    public static final String TEMPLATE_NAME = "book";
    public static final String BASE_ROUTE = "book";

    public BookController() {
        super(TEMPLATE_NAME);
    }
    
    @Autowired
    private UserService userService;
    
    protected Book preCreatePost(BookDto dto) throws Exception {
    	Book book = new Book();
    	book.setName(dto.getName());
    	book.setNbrpages(dto.getNbrpages());
    	book.setPrice(dto.getPrice());
    	

        return book;
    	
    	

    }
     
}
